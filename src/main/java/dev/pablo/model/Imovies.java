package dev.pablo.model;

import java.util.List;
import java.util.Optional;

public interface Imovies {
    public void save(Movie movie);
    public Optional<Movie> getById(int id);
    public void removeById(int id);
    public List<Movie> getAll(); 
}
