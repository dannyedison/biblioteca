package com.example.bibliotecadigitalapp;

public class ListElement {
    private String titulo;
    private String autor;
    private int imagen;

    public ListElement(String titulo, String autor, int imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public CharSequence getAutor() {
        return autor;
    }

    public int getImagen() {
        return imagen;
    }



}



