package com.OReilly.functions;

import java.util.function.Consumer;

/**
 * @author vidit.singh
 * @created 05/05/2022 - 11:48
 */
public class ConsumerInterface {
    /**
     * Consumer has accept() method which takes 1 argument and returns void.
     * Suitable for persisting data or printing.
     */

    /**
     * @param movie
     * @param consumer
     */
    private void getAwesomeMovieName(Movie movie,Consumer<Movie> consumer){
       consumer.accept(movie);
    }

    /**
     * Chaining consumers using andThen()
     */

    private void verifyAndThen(Movie movie){
        Consumer<Movie> movieConsumer = m -> System.out.println(m.getTitle() + " is an awesome movie!");
        Consumer<Movie> persistMovie = p -> persist(p.getTitle());
        Consumer<Movie> ratings = r -> getAwesomeMovieRatings(r.getRatings());

        Consumer<Movie> chainedConsumer = movieConsumer.andThen(persistMovie).andThen(ratings);
        chainedConsumer.accept(movie);

    }

    private void getAwesomeMovieRatings(int ratings) {
        System.out.println("Awesome movie ratings -> "+ ratings);
    }

    private void persist(String title) {
        System.out.println("Persisting movie to DB. " + title);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Avengers",10);
//        new ConsumerInterface()
//                .getAwesomeMovieName(movie,m -> System.out.println(m.getTitle() + " is an awesome movie!"));


        new ConsumerInterface().verifyAndThen(movie);
    }
}

class Movie{
    String title;
    int ratings;

    public Movie(String title, int ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
