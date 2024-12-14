package dev.pablo;

import java.util.List;
import java.util.Optional;

import dev.pablo.model.Movie;
import dev.pablo.services.MovieService;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        try {
            System.out.println("###################################################################################################################");

            List<Movie> movies = movieService.getAll();

            for( Movie m :movies){
                System.out.println(m.toString());
            }

        } finally {
            movieService.closeSession();
        }
    }

}