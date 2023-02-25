package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private double imdbRating;

    public Director(){
    }

    public Director(String name, int numberOfMovies, double imdbRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return name;
    }

    public int getCountOfMovies() {
        return numberOfMovies;
    }

    public double getImdbRating() {
        return imdbRating;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCountOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public void setImbRating(double imbRating) {
        this.imdbRating = imbRating;
    }
}
