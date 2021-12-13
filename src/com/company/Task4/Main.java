package com.company.Task4;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>();
        fruits.add(new Fruit("Yabloko", "red", 123));
        fruits.add(new Fruit("Kav", "green", 25));
        fruits.add(new Fruit("bafnan", "yellow", 123));
        fruits.add(new Fruit("apelfin", "orange", 21));
        fruits.add(new Fruit("pomello", "black", 43));

        System.out.println("All fruits");
        fruits.forEach(System.out::println);

        System.out.println("\n First collection");
        Map<String, String> collOne = fruits.stream()
                .collect(Collectors.toMap(s -> s.getName(), s1 -> s1.getColor()));
        collOne.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("\n Second collection");
        String collTwo = fruits.stream()
                .map(f -> f.getName())
                .filter(f -> f.contains("f"))
                .collect(Collectors.joining(" "));
        System.out.println(collTwo);

        System.out.println("\n Third collection");
        String collThree = fruits.stream()
                .filter(f -> f.getName().length() > 5)
                .filter(f -> f.getWeight() < 40)
                .map(f -> f.getColor())
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
