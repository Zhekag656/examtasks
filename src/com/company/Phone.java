package com.company;

import java.util.Objects;

public class Phone implements Comparable<Phone>{
    private String name;
    private String company;
    private int price;

    @Override
    public String toString() { return "{" +
            "name='" + name + '\'' +
            ", company =" + company +
            ", price ='" + price + "$" + '\'' +
            '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name) && Objects.equals(company, phone.company);
    }

    @Override
    public int hashCode() { return Objects.hash(name, company, price); }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public int compareTo(Phone o) {
        int result = this.name.compareTo(o.name);

        if(result == 0){
            result = Integer.compare(this.price, o.price);
        }

        return result;
    }
}
