package com.ashok.predefined.interfaces;

import java.util.List;
import java.util.function.Consumer;

public class PracticeConsumer {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 6, 3, 70, 50, 60, 25);
        Consumer<Integer> consumer = e -> System.out.println(e);
        consumer.accept(7);
        printAllElementInList(list, consumer);

        //generics to accept anytime of input
        printAllElementInListGenrics(list, consumer);
        List<String> strings = List.of("Ashok", "Kaleem", "Avinash");
        Consumer<String> consumer1 = e -> System.out.println(e);
        printAllElementInListGenrics(strings, consumer1);
    }

    private static <T> void printAllElementInListGenrics(List<T> list, Consumer<T> consumer) {
        for (T i : list) {
            consumer.accept(i);
        }

    }

    private static void printAllElementInList(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer i : list) {
            consumer.accept(i);
        }
    }
}
