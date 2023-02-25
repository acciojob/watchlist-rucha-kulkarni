package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService {
    @Autowired
    Repository repository;

    public void addMovie(Movie movie){
        repository.saveMovie(movie);
    }
    public void addDirector(Director director){
        repository.saveDirector(director);
    }
    public void createMovieDirectorPair(String movie,String director){
        repository.saveMovieDirectorPair(movie,director);
    }
    public Movie findMovie(String movieName){
        return repository.findMovie(movieName);
    }

    public Director findDirector(String directorName){
        return repository.findDirector(directorName);
    }

    public List<String> findMovieFromDirector(String director){
        return repository.findMoviesFromDirector(director);
    }

    public List<String> findAllMovies(){
        return repository.findAllMovies();
    }

    public void deleteDirector(String director){
         repository.deleteDirector(director);
    }

    public void deleteAllDirectors(){
         repository.deleteAllDirectors();
    }

}
