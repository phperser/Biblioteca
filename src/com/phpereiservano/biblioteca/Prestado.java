package com.phpereiservano.biblioteca;

import java.util.Date;

public class Prestado {

        private Integer id;
        private Date fechaInicio;
        private Date fechaFin;
        private Usuario usuario;
        private Libro libro;

        public Integer getId(){return id;}
        public void setId (Integer id){this.id = id;}

        public Date getFechaInicio(){return fechaInicio;}
        public void setFechaInicio(Date fechaInicio){this.fechaInicio = fechaInicio;}

        public Date getFechaFin(){return fechaFin;}
        public void setFechaFin(Date startDate){this.fechaFin = fechaFin;}

        public Usuario getUsuario() {return usuario;}
        public void setUsuario(Usuario usuario) {this.usuario = usuario;}

        public Libro getLibro() {return libro;}
        public void setLibro(Libro libro) {this.libro = libro;}


}
