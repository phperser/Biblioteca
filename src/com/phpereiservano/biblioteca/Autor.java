package com.phpereiservano.biblioteca;

import java.util.Date;

public class Autor {
        private Integer idAutor;
        private String nombre;
        private String apellidos;
        private Date fecNac;
    //fecNac = Fecha de Nacimiento
        private String locNac;
    //locNac = Localidad de Nacimiento

    public Integer getIdAutor() {
        return idAutor;
    }
    public void setId(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecNac() {return fecNac;}
    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getLocNac() {
        return locNac;
    }
    public void setLocNac(String locNac) {
        this.locNac = locNac;
    }
}
