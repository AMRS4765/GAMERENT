package com.mycompany.models;

import java.math.BigDecimal;

public class juegos {
    private int idjuego;
    private String titulo;
    private String descripcion;
    private String plataforma;
    private String genero;
    private BigDecimal precio;
    private int stock;
    private int disponible;

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getIdjuego() {
        return idjuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getDisponible() {
        return disponible;
    }

}
