package com.company.Task5;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<BulletProofVest> bulletProofVests = new TreeSet<>();

        bulletProofVests.add(new BulletProofVest("Bull1", 12, 1));
        bulletProofVests.add(new BulletProofVest("Bull2", 232, 3));
        bulletProofVests.add(new BulletProofVest("Bull3", 322, 2));
        bulletProofVests.add(new BulletProofVest("Bull4", 12132, 4));
        bulletProofVests.add(new BulletProofVest("Bull5", 2, 5));
        bulletProofVests.add(new BulletProofVest("Bull6", 1332, 2));
        bulletProofVests.add(new BulletProofVest("Bull7", 142, 1));

        System.out.println("All bullets:");
        bulletProofVests.forEach(System.out::println);

        System.out.println("Collection 1:");
        List<String> collOne = bulletProofVests.stream()
                .map(b -> b.getName())
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("Collection 2:");
        String collTwo = bulletProofVests.stream()
                .map(b -> b.getName())
                .collect(Collectors.joining(" - "));
        System.out.println(collTwo);

        System.out.println("Collection 3:");
        List<BulletProofVest> collThree = bulletProofVests.stream()
                .filter(f -> f.getLevel() < 3)
                .sorted((b1, b2) -> b2.getWeight() - b1.getWeight())
                .collect(Collectors.toList());
        collThree.forEach(System.out::println);
    }
}
