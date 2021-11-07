package com.core.back.controllers.dto;

import java.util.Date;

public class ParametroDTO {
    private int id;
    private int id_cabecera;
    private String nombre;
    private String descripcion;
    private double valor;
    private Date create_date;
    private Date update_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCabecera() {return id_cabecera;}

    public void setIdCabecera(int id_cabecera) {this.id_cabecera = id_cabecera;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public ParametroDTO(int id, int id_cabecera, String nombre, String descripcion, double valor, Date create_date, Date update_date) {
        this.id = id;
        this.id_cabecera = id_cabecera;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.create_date = create_date;
        this.update_date = update_date;
    }

    public ParametroDTO() {
    }
}
