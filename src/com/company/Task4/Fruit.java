package com.company.Task4;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private String color;
    private int weight;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return weight == fruit.weight
                && Objects.equals(name, fruit.name)
                && Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruit o) { return String.valueOf(weight).compareTo(String.valueOf(o.getWeight())) == 0 ? name.compareTo(o.getName()) : 1; }
}
