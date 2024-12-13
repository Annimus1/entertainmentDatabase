package dev.pablo;

import java.time.LocalDate;

import dev.pablo.model.Movie;
import dev.pablo.services.MovieService;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        Movie movie1 = new Movie("test1", 5.0f, "English", "note1", "Movie", LocalDate.of(2024, 11, 11));
        Movie movie2 = new Movie("test2", 6.0f, "Spanish", "note2", "Serie", LocalDate.of(2024, 11, 11));
        Movie movie3 = new Movie("test3", 7.0f, "Sub-Spanish", "note3", "Anime", LocalDate.of(2024, 11, 11));
        Movie movie4 = new Movie("test4", 8.0f, "English", "note4", "Movie", LocalDate.of(2024, 11, 11));

        try {

            movieService.save(movie1);
            movieService.save(movie2);
            movieService.save(movie3);
            movieService.save(movie4);
        } finally {
            movieService.closeSession();
        }
    }

}