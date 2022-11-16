package com.phpereiservano.biblioteca;

import java.util.Date;

public class loan {
    private Integer id;
    private Date startDate;
    private Date stopDate;
    private Usuario usuario;
    private Libro libro;


    //Metodos

    public Integer getId(){return id;}
    public void setId (Integer id){this.id = id;}

    public Date getStartDate(){return startDate;}
    public void setStartDate(Date startDate){this.startDate = startDate;}

    public Date getStopDate(){return stopDate;}
    public void setStopDate(Date startDate){this.stopDate = stopDate;}

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario user) {this.usuario = usuario;}

    public Libro getLibro() {return libro;}
    public void setLibro(Libro libro) {this.libro = libro;}

}
