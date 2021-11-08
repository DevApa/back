package com.core.back.repository.model;

import io.swagger.v3.oas.annotations.tags.Tag;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Tag(name = "universidad")
public class University implements Serializable {

    private static final long serialVersionUID =1l;

    @Id
    @Column(name = "id_universidad", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(name = "nombre_intitucion")
    private String nombre;

    @Column(name = "nombre_intitucion")
    private String descripcion;

    @Column(name = "nombre_intitucion")
    @Temporal(TemporalType.DATE.TIMESTAMP)
    private Date create_date;
    @Column(name = "nombre_intitucion")
    @Temporal(TemporalType.DATE.TIMESTAMP)
    private Date update_date;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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
}
