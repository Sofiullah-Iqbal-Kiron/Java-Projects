package com.Practice.Streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        List<Movie> movies = List.of(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));

//        Let's get a stream/pipe of this collection: movies
        Predicate<Movie> hasMoreThan10Likes = movie -> movie.getLikes() > 10;
        Stream movieStream = movies.stream();
        movieStream.forEach(m -> System.out.println(m));
    }
}
