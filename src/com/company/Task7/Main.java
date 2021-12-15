package com.company.Task7;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Phone> phones = new TreeSet<>();

        phones.add(new Phone("IPhone", "Apple", 20000));
        phones.add(new Phone("Doogee", "Ipple", 2000));
        phones.add(new Phone("Poco", "Xiaomi", 30000));
        phones.add(new Phone("Zhopa", "Iaomi", 3000));
        phones.add(new Phone("Samsun`", "Samsung", 4000));

        System.out.println("All phones");
        phones.forEach(System.out::println);

        System.out.println("\n Collection 1:");
        List<Phone> collOne = phones.stream()
                .filter(p -> p.getCompany().startsWith("I"))
                .collect(Collectors.toList());
        collOne.forEach(System.out::println);

        System.out.println("\n Collection 2:");
        Phone collTwo = phones.stream()
                .max((p1, p2) -> p1.getPrice() - p2.getPrice())
                .get();
        System.out.println(collTwo);

        System.out.println("\n Collection 3:");
        Map<String, String> collThree = phones.stream()
                .collect(Collectors.toMap(p -> p.getName(), p1 -> p1.getCompany()));
        System.out.println(collThree);
    }
}
