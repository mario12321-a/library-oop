package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String ISBN;
    private String titulo;
    private int año;
    private Autor [] autores;

    public Book(String ISBN, String titulo, int año, Autor[] autores) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.año = año;
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return año == book.año && Objects.equals(ISBN, book.ISBN) && Objects.equals(titulo, book.titulo) && Objects.deepEquals(autores, book.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo, año, Arrays.hashCode(autores));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }

}
