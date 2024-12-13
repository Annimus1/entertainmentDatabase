package dev.pablo.model;

import java.util.Optional;

public interface Imovies {
    public void save(Movie movie);
    public Optional<Movie> getById();
    public void removeById();
}
