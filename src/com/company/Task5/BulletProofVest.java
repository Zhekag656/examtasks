package com.company.Task5;

import java.util.Objects;

public class BulletProofVest implements Comparable<BulletProofVest>{
    private String name;
    private int weight;
    private int level;

    @Override
    public int compareTo(BulletProofVest o) {
        return name.compareTo(o.getName()) == 0 ? String.valueOf(weight).compareTo(String.valueOf(o.getWeight())) : 1;
    }

    @Override
    public String toString() {
        return "BulletProofVest{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BulletProofVest that = (BulletProofVest) o;
        return weight == that.weight && level == that.level && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BulletProofVest(String name, int weight, int level) {
        this.name = name;
        this.weight = weight;
        this.level = level;
    }
}
