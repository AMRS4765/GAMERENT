package com.mycompany.models;

public class prestamos {
    private int idprestamo;
    private String date_out;
    private String date_return;
    private int idcliente;
    private int idjuego;

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public String getDate_out() {
        return date_out;
    }

    public String getDate_return() {
        return date_return;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public int getIdjuego() {
        return idjuego;
    }

}
