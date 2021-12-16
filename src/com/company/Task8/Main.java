package com.company.Task8;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("Ivan", "Maksymchuk", 18));
        people.add(new Person("Anna", "Shevchenko", 11));
        people.add(new Person("Eugene", "Kornienko", 34));
        people.add(new Person("Vladislav", "Musikhin", 23));
        people.add(new Person("Aolya", "Mudrenko", 45));
        people.add(new Person("Andriy", "Jopa", 20));

        System.out.println("All people");
        people.forEach(System.out::println);

        System.out.println("\n Collection 1");
        Map<String, String> collOne = people.stream()
                .collect(Collectors.toMap(b1 -> b1.getName(), b2 -> b2.getLastName()));
        collOne.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("\n Collection 2");
        List<Person> collTwo = people.stream()
                .filter(b -> b.getAge() >= 20)
                .collect(Collectors.toList());
        collTwo.forEach(System.out::println);

        System.out.println("\n Collection 3");
        String collThree = people.stream()
                .filter(p -> p.getLastName().length() > 6)
                .map(p -> p.getName()).filter(s -> s.startsWith("A"))
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
