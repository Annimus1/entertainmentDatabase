package dev.pablo.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.pablo.lib.SessionFactoryCustom;
import dev.pablo.model.Imovies;
import dev.pablo.model.Movie;
import jakarta.persistence.NoResultException;

public class MovieService implements Imovies {

    SessionFactory sessionFactory;
    public static Session session;

    public MovieService() {
        sessionFactory = new SessionFactoryCustom().getSessionFactory();
        session = sessionFactory.openSession();
    }

    @Override
    public void save(Movie movie) {

        session.beginTransaction();
        
        session.merge(movie);
        
        session.getTransaction().commit();
    }

    public void closeSession() {
        sessionFactory.close();
    }

    @Override
    public Optional<Movie> getById(int id) {
        Optional<Movie> result;        
        try{

            result = Optional.ofNullable(session.createQuery("SELECT m FROM Movie m WHERE m.id = :id",Movie.class).
            setParameter("id", id)
            .getSingleResult());
            
        }
        catch(NoResultException e){
            result = Optional.empty();
        }
            
        return result;
    }

    @Override
    public void removeById(int id) {
        Optional<Movie> movie = getById(id);

        if (movie.isPresent()) {
            session.getTransaction().begin();

            session.remove(movie.get());
            
            session.getTransaction().commit();

            System.out.println("INFO: Deleted "+movie.toString());
        }else{
            System.out.println("Error: Unable to delete movie with id="+id+", due doesn't exist in database.");
        }
    }

    @Override
    public List<Movie> getAll() {
        // session.getTransaction().begin();
        
        List<Movie> results = session.createQuery("SELECT m FROM Movie m",Movie.class)
                                            .getResultList();
        
        // session.getTransaction().commit();

        return results;
    }

}
