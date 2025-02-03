package org.ies.library.componentes;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader autorReader;

    public BookReader(Scanner scanner, AutorReader autorReader){
        this.scanner= scanner;
        this.autorReader=autorReader;
    }
    public Book read(){
        System.out.println("introduce los datos del libro: ");
        System.out.println("ISBN ");
        String isbn=scanner.nextLine();

        System.out.println("titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("año de publicacion: ");
        int year= scanner.nextInt();
        scanner.nextLine();

        System.out.println("cuantos autores tiene el libro ");
        int numAutores= scanner.nextInt();
        scanner.nextLine();

        Autor [] autors = new Autor[numAutores];
        for(int i=0; i<autors.length; i++){
            autors[i]= autorReader.read();
        }
        return new Book(isbn,titulo,year,autors);
    }
}
