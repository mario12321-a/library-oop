package org.ies.library.componentes;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BibliotecaReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public BibliotecaReader (Scanner scanner, BookReader bookReader){
        this.scanner = scanner;
        this.bookReader = bookReader;
    }
    public Biblioteca read(){
        System.out.println("introduce los datos de la biblioteca ");
        System.out.println("Nombre ");
        String name = scanner.nextLine();

        System.out.println("cuantos libros tiene la biblioteca ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        Book [] books = new Book[numBooks];
        for(int i=0; i<books.length; i++){
            books[i]= bookReader.read();
        }

        return new Biblioteca(
                name,
                books
        );

    }
}
