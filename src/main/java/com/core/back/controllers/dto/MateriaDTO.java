package com.core.back.controllers.dto;

import java.util.Date;

public class MateriaDTO {
    private int id;
    private int id_area_conocimiento;
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

    public int getId_area_conocimiento() {
        return id_area_conocimiento;
    }

    public void setId_area_conocimiento(int id_area_conocimiento) {
        this.id_area_conocimiento = id_area_conocimiento;
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

    public MateriaDTO(int id, int id_area_conocimiento, String nombre, String descripcion, Date create_date, Date update_date) {
        this.id = id;
        this.id_area_conocimiento = id_area_conocimiento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.create_date = create_date;
        this.update_date = update_date;
    }

    public MateriaDTO() {
    }
}
