package org.ies.library.componentes;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;
    public AutorReader(Scanner scanner){
        this.scanner = scanner;
    }
    public Autor read(){
        System.out.println("introduce los datos del autor ");
        System.out.println("NIF : ");
        String nif = scanner.nextLine();

        System.out.println("nombre : ");
        String name = scanner.nextLine();

        System.out.println("apellido : ");
        String surName = scanner.nextLine();

        return new Autor(
                nif,
                name,
                surName
        );
    }
}
