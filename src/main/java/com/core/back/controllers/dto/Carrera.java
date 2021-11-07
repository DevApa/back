package com.core.back.controllers.dto;

import java.util.Date;

public class Carrera {
    private int id;
    private int id_facultad;
    private String nombre;
    private String descripcion;
    private Date create_date;
    private Date update_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

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

    public Carrera(int id, int id_facultad, String nombre, String descripcion, Date create_date, Date update_date) {
        this.id = id;
        this.id_facultad = id_facultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.create_date = create_date;
        this.update_date = update_date;
    }

    public Carrera() {
    }
}
