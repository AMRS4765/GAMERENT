package com.mycompany.models;

import java.math.BigDecimal;

public class clientes {
    private int idcliente;
    private String user;
    private String pass;
    private String nombres;
    private String apellido_p;
    private String apellido_m;
    private String calle;
    private int num_casa;
    private String tel;
    private int sancion;
    private BigDecimal sanc_money;

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSancion(int sancion) {
        this.sancion = sancion;
    }

    public void setSanc_money(BigDecimal sanc_money) {
        this.sanc_money = sanc_money;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public String getCalle() {
        return calle;
    }

    public int getNum_casa() {
        return num_casa;
    }

    public String getTel() {
        return tel;
    }

    public int getSancion() {
        return sancion;
    }

    public BigDecimal getSanc_money() {
        return sanc_money;
    }

}
