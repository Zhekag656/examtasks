package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("Jopa", "Samsung", 1900);
        Phone phone2 = new Phone("IPhone", "Apple", 5000);
        Phone phone3 = new Phone("TeslaPhone", "Tesla", 600);
        Phone phone4 = new Phone("Poco", "Xiaomi", 1500);
        Phone phone5 = new Phone("Meizu", "Meizu", 2002);

        Set<Phone> array = new TreeSet<>();
        array.add(phone1);
        array.add(phone2);
        array.add(phone3);
        array.add(phone4);
        array.add(phone5);
        System.out.println("--Phone Example");
        for(Phone p : array){
            System.out.println();
        }
    }
}
