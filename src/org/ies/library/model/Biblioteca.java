package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String name;
    private Book[] books;

    public Biblioteca(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public boolean hasAutor(String nif) {
        for (var book : books) {
            if (book.hasAutor(nif)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasBook(String isbn) {
        for (var book : books) {
            if (book.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    public int countAutorBooks(String autorNif) {
        int count = 0;
        for (var book : books) {
            if (book.hasAutor(autorNif)) {
                count++;
            }
        }
        return count;
    }

    public int countYearBooks(int year) {
        int count = 0;
        for (var book : books) {
            if (book.getYear() == year) {
                count++;
            }
        }
        return count;
    }

    public Book findBook(String isbn){
        for(var book:books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

}
