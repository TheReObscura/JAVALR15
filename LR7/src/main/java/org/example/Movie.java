package org.example;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public static int totalMovies = 0;
    public static int totalDuration = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String director, int duration) {
        setTitle(title);
        setDirector(director);
        setDuration(duration);

        totalMovies++;
        totalDuration += duration;
    }

    public static double getAverageDuration() {
        return (double) totalDuration / totalMovies;
    }

    public void print() {
        System.out.println("Фильм: " + getTitle() + ", длительность фильма: " + getDuration() + ". Директор: " + getDirector());
    }
}
