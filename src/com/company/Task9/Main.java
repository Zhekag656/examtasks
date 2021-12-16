package com.company.Task9;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Tank> tanks = new TreeSet<>();

        tanks.add(new Tank("NeTank1", "Manufacturer1", 213));
        tanks.add(new Tank("Tank2", "Manufacturor2", 2513));
        tanks.add(new Tank("NETank3", "Manufacturer3", 23));
        tanks.add(new Tank("ank4", "Manufacturor4", 513));
        tanks.add(new Tank("Tank5", "Manufacturer5", 21));

        System.out.println("All tanks");
        tanks.forEach(System.out::println);

        System.out.println("\n Collection 1");
        List<Tank> collOne = tanks.stream()
                .filter(t -> t.getWeight() < 40)
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("\n Collection 2");
        String collTwo = tanks.stream()
                .map(s -> s.getManufacturer())
                .filter(t -> t.contains("o"))
                .collect(Collectors.joining(" "));
        System.out.println(collTwo);

        System.out.println("\n Collection 3");
        String collThree = tanks.stream()
                .map(s -> s.getName())
                .filter(f -> f.startsWith("T"))
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
