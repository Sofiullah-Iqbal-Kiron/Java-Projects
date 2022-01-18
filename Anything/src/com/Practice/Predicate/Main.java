package com.Practice.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> hasLeftBrace = string -> string.trim().startsWith("{");
        Predicate<String> hasRightBrace = string -> string.trim().endsWith("}");
        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasLeftBrace);

        System.out.println(hasLeftAndRightBraces.test(" {Kiron}"));
    }
}
