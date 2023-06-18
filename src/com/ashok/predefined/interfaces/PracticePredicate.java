package com.ashok.predefined.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {
        List<String> list = List.of("Ashok", "Avinash", "", "", "JagAshAvi");

        Predicate<String> predicate = s -> !s.isBlank();

        List<String> listWithoutEmptyStrings = filterEmptyStringInTheList(list, predicate);
        System.out.println(listWithoutEmptyStrings);

        Predicate<String> predicate1 = s -> s.contains("Avi");
        List<String> listWithStringAvi = getAllStringWithAvi(list, predicate1);
        System.out.println(listWithStringAvi);

    }

    private static List<String> getAllStringWithAvi(List<String> list, Predicate<String> predicate1) {
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (predicate1.test(str)) {
                newList.add(str);
            }

        }

        return newList;

    }

    private static List<String> filterEmptyStringInTheList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (predicate.test(str)) {
                newList.add(str);
            }

        }

        return newList;
    }
}
