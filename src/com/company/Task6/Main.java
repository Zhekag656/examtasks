package com.company.Task6;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Aook1", "Author1", 245));
        books.add(new Book("Book2", "buthor2", 213));
        books.add(new Book("Book3", "zuthor3", 545));
        books.add(new Book("Aook4", "yuthor4", 645));
        books.add(new Book("Book5", "futhor5", 3245));

        System.out.println("All books");
        books.forEach(System.out::println);

        System.out.println("Collection 1:");
        List<Integer> collOne = books.stream()
                .filter(b -> b.getName().startsWith("A"))
                .map(b -> b.getPageCount())
                .collect(Collectors.toList());
        System.out.println(collOne);

        System.out.println("Collection 2:");
        List<Book> collTwo = books.stream()
                .sorted((b1, b2) -> b1.getAuthorName().compareTo(b2.getAuthorName()))
                .collect(Collectors.toList());
        collTwo.forEach(System.out::println);

        System.out.println("Collection 3:");
        List<Book> collThree = books.stream()
                .sorted((b1,b2) -> b2.getPageCount() - b1.getPageCount())
                .collect(Collectors.toList());
        collThree.forEach(System.out::println);
    }
}
