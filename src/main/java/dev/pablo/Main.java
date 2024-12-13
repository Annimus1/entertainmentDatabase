package dev.pablo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
// Main class
public class Main {
 
    // Main driver method
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
 
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Movie.class);
 
        // Create Session Factory and auto-close with try-with-resources.
        try (SessionFactory sessionFactory
                = configuration.buildSessionFactory()) {
 
            // Initialize Session Object
            Session session = sessionFactory.openSession();
            
            Movie movie1 = new Movie("test2",5.0f,"Spanish","note2","Anime",LocalDate.of(2024, 12, 11));
            Movie movie2 = new Movie("test3",10.5f,"Spanish","note3","Serie",LocalDate.of(2024, 12, 10));
            Movie movie3 = new Movie("test1",3.5f,"English","note1","Movie",LocalDate.of(2024, 12, 8));
 
            
            session.beginTransaction();
 
            // Here we have used
            // persist() method of JPA
            session.persist(movie1);
            session.persist(movie2);
            session.persist(movie3);
 
            session.getTransaction().commit();

            sessionFactory.close();
        }
    }
}