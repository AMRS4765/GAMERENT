package com.mycompany.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class compras {
    private int idcompra;
    private BigDecimal gasto;
    private int cantidad;
    private LocalDate fecha;
    private int idjuego;
    private int idempleado;

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public void setGasto(BigDecimal gasto) {
        this.gasto = gasto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public BigDecimal getGasto() {
        return gasto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdjuego() {
        return idjuego;
    }

    public int getIdempleado() {
        return idempleado;
    }

}
