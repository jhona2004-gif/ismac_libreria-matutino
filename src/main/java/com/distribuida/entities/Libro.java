package com.distribuida.entities;

import java.util.Date;

public class Libro {
    private int idlibro;
    private String titulo;
    private String editorial;
    private int numPagmas;
    private String edicion;
    private String edioma;
    private Date fechaPublicacion;
    private String descripcion;
    private String tipoPasta;
    private String ISBN;
    private int numEjemplares;
    private String portada;
    private String presentation;
    private Float precio;


    private Categoria categoria;
    private Autor autor;

    public Libro() {
    }

    public Libro(int idlibro, String titulo, String editorial, int numPagmas, String edicion, String edioma, Date fechaPublicacion, String descripcion, String tipoPasta, String ISBN, int numEjemplares, String portada, String presentation, Float precio, Categoria categoria, Autor autor) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numPagmas = numPagmas;
        this.edicion = edicion;
        this.edioma = edioma;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.tipoPasta = tipoPasta;
        this.ISBN = ISBN;
        this.numEjemplares = numEjemplares;
        this.portada = portada;
        this.presentation = presentation;
        this.precio = precio;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPagmas() {
        return numPagmas;
    }

    public void setNumPagmas(int numPagmas) {
        this.numPagmas = numPagmas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEdioma() {
        return edioma;
    }

    public void setEdioma(String edioma) {
        this.edioma = edioma;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idlibro=" + idlibro +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numPagmas=" + numPagmas +
                ", edicion='" + edicion + '\'' +
                ", edioma='" + edioma + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", descripcion='" + descripcion + '\'' +
                ", tipoPasta='" + tipoPasta + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", portada='" + portada + '\'' +
                ", presentation='" + presentation + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }
}
