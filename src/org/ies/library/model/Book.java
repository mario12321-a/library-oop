package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String titulo;
    private int año;
    private Autor [] autores;

    public boolean hasAuthor(String nif){
        for(var author: autores){
            if(author.getNif().equals(nif)){

                return true;
            }
        }
        return false;
    }

    public Book(String ISBN, String titulo, int año, Autor[] autores) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.año = año;
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        return año == book.año && Objects.equals(isbn, book.isbn) && Objects.equals(titulo, book.titulo) && Objects.deepEquals(autores, book.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, año, Arrays.hashCode(autores));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }

}
