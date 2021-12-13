package com.company.Task3;

import java.util.Objects;

public class Tank implements Comparable<Tank>{
    private String name;
    private String manufacturer;
    private int weight;

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return weight == tank.weight
                && Objects.equals(name, tank.name)
                && Objects.equals(manufacturer, tank.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, weight);
    }

    public Tank(String name, String manufacturer, int weight) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Tank o) {
        return name.compareTo(o.getName()) == 0 ? manufacturer.compareTo(o.getManufacturer()) : 1;
    }
}
