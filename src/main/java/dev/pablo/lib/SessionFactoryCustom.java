package dev.pablo.lib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.pablo.model.Movie;

public class SessionFactoryCustom {
    private Configuration configuration;
    private SessionFactory sessionFactory;
    
    
    public SessionFactoryCustom(){

        // Create Configuration
        this.configuration = new Configuration();
        this.configuration.configure("hibernate.cfg.xml");
        this.configuration.addAnnotatedClass(Movie.class);
        
        // Create Session Factory and auto-close with try-with-resources.
        this.sessionFactory = configuration.buildSessionFactory();
    }

    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }

}
