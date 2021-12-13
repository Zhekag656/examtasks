package com.company.Task3;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Tank> tanks = new TreeSet<>();
        tanks.add(new Tank("zhopa", "tcm", 2000));
        tanks.add(new Tank("zalupa", "vxz", 2121));
        tanks.add(new Tank("pizda", "sca", 3411));
        tanks.add(new Tank("T-34", "ussr", 2131));
        tanks.add(new Tank("pz-1c", "Germany", 1312));

        System.out.println("All tanks:");
        tanks.forEach(System.out::println);

        System.out.println("\n First collection:");
        Map<String, String> collOne = tanks.stream()
                .collect(Collectors.toMap(t -> t.getName(), t -> t.getManufacturer()));
        collOne.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("\n Second collection");
        String collTwo = tanks.stream()
                .map(t -> t.getManufacturer())
                .filter(t -> t.contains("c"))
                .collect(Collectors.joining(" "));
        System.out.println(collTwo);

        System.out.println("\n Third collection");
        String collThree = tanks.stream()
                .map(t -> t.getName())
                .filter(t -> t.startsWith("T"))
                .collect(Collectors.joining(" "));
        System.out.println(collThree);
    }
}
