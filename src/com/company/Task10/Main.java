package com.company.Task10;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>();

        fruits.add(new Fruit("Apple", "Green", 2));
        fruits.add(new Fruit("Tomato", "Orange", 1));
        fruits.add(new Fruit("Watermelon", "Blue", 13));
        fruits.add(new Fruit("Melon", "Yellow", 3));
        fruits.add(new Fruit("Strawberry", "Red", 3213));

        System.out.println("All fruits");
        fruits.forEach(System.out::println);

        System.out.println("\n Collection 1");
        List<String> collOne = fruits.stream()
                .map(f -> f.getColor())
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("\n Collection 2");
        List<Fruit> collTwo = fruits.stream()
                .filter(f -> f.getWeight() < 5)
                .collect(Collectors.toList());
        collTwo.forEach(System.out::println);

        System.out.println("\n Collection 3");
        String collThree = fruits.stream()
                .filter(f -> f.getName().length() > 5)
                .map(s -> s.getColor())
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
