package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private double imbRating;

    public Director(){
    }

    public Director(String name, int numberOfMovies, double imbRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public int getCountOfMovies() {
        return numberOfMovies;
    }

    public double getImbRating() {
        return imbRating;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCountOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public void setImbRating(double imbRating) {
        this.imbRating = imbRating;
    }
}
