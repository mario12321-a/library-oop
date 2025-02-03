package org.ies.library.model;

import java.util.Objects;

public class Autor {
    private String nif;
    private String name;
    private String surName;

    public Autor(String nif, String name, String surName) {
        this.nif = nif;
        this.name = name;
        this.surName = surName;
    }

    //public void showInfo(){
        //System.out.println("NIF: " + nif + "Nombre: " + name + "Apellido: " + surName );
    //}

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nif, autor.nif) && Objects.equals(name, autor.name) && Objects.equals(surName, autor.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surName);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
