package com.proyecto.fubol.FutbolApp.modelos;



import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "historico_equipos")
public class HistoricoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    private String nombreEquipo;
    private Date fechaInicio;
    private Date fechaFin;

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public HistoricoEquipo() {}

    public HistoricoEquipo(String nombre, String apellido, String nombreEquipo, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreEquipo = nombreEquipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
