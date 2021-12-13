package com.company.Task2;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Dasha", "Shevchenko", 18));
        people.add(new Person("Dima", "Antoniuk", 19));
        people.add(new Person("Mitalik", "Brazillian", 10));
        people.add(new Person("Bogdan", "Kholyavka", 25));
        people.add(new Person("Vlad", "Durak", 13));

        System.out.println("All people");
        people.forEach(System.out::println);

        System.out.println("\n Collection 1:");
        List<String> collOne = people.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("Collection 2:");
        String collTwo = people.stream()
                .map(s -> s.getLastName())
                .filter(p -> p.length() > 5)
                .collect(Collectors.joining(" "));
        System.out.println(collTwo);

        System.out.println("Collection 3:");
        String collThree = people.stream()
                .map(p -> p.getName())
                .filter(p -> p.startsWith("M"))
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
