package dev.pablo.services;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.pablo.lib.SessionFactoryCustom;
import dev.pablo.model.Imovies;
import dev.pablo.model.Movie;

public class MovieService implements Imovies {

    SessionFactory sessionFactory;
    Session session;

    public MovieService() {
        this.sessionFactory = new SessionFactoryCustom().getSessionFactory();
        this.session = sessionFactory.openSession();
    }

    @Override
    public void save(Movie movie) {
 
            this.session.beginTransaction();

            this.session.persist(movie);

            this.session.getTransaction().commit();
    }

    public void closeSession(){
        this.sessionFactory.close();
    }

    @Override
    public Optional<Movie> getById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public void removeById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeById'");
    }

}
