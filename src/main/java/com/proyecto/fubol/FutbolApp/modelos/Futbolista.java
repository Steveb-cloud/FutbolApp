package com.proyecto.fubol.FutbolApp.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "futbolista")
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    private int numeroCamisa;
    private Date fechaNacimiento;
    private Date fechaRetiro;
    private String estado;

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

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Futbolista() {}

    public Futbolista(String nombre, String apellido, int numeroCamisa, Date fechaNacimiento, Date fechaRetiro, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCamisa = numeroCamisa;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRetiro = fechaRetiro;
        this.estado = estado;
    }
}
