package com.company.Task6;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String name;
    private String authorName;
    private int pageCount;

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.getName()) == 0 ? String.valueOf(pageCount).compareTo(String.valueOf(o.getPageCount())) : 1;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, pageCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Book(String name, String authorName, int pageCount) {
        this.name = name;
        this.authorName = authorName;
        this.pageCount = pageCount;
    }
}
