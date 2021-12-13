package com.company.Task1;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        TreeSet<Phone> phones = new TreeSet<>();
        phones.add(new Phone("Jopa", "Samsung", 1234));
        phones.add(new Phone("TeslaPhone", "Tesla", 600));
        phones.add(new Phone("IPhone", "Apple", 125));
        phones.add(new Phone("Poco", "Xiaomi", 100));
        phones.add(new Phone("P Smart", "Huawei", 2145));

        System.out.println("All phones:");
        phones.forEach(System.out::println);

        System.out.println("\n Collection 1:");
        List<String> collOne = phones.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("\n Collection 2:");
        String collTwo = phones.stream()
                .map(p -> Integer.toString(p.getPrice()))
                .collect(Collectors.joining(" $ "));
        System.out.println(collTwo);

        System.out.println("\n Collection 3");
        List<Phone> collThree = phones.stream()
                .sorted((p1, p2) ->p2.getPrice() - p1.getPrice())
                .collect(Collectors.toList());
        collThree.forEach(System.out::println);
    }
}
