package com.phpereiservano.biblioteca;

import java.util.Date;

public class Libro {
    private Integer ID;
    private Integer ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private String fechaPublicacion;

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getISBN() {
        return ISBN;
    }
    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() { return  titulo;}
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
