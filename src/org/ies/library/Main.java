package org.ies.library;

import org.ies.library.componentes.AutorReader;
import org.ies.library.componentes.BibliotecaReader;
import org.ies.library.componentes.BookReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        var autorReader = new AutorReader(Scanner);
        var bookReader = new BookReader (Scanner, autorReader);
        var bibliotecaReader = new BibliotecaReader(Scanner, bookReader);

        var biblioteca = bibliotecaReader.read();
        System.out.println(biblioteca);
    }
}