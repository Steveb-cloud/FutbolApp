package com.proyecto.fubol.FutbolApp.modelos;




import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "equipos")
public class equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipo;

    private String nombre;
    private String lugarEquipo;
    private int campeonatosGanados;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    // Getters y Setters

    // Constructor sin argumentos
    public equipo() {}

    // Constructor con argumentos
    public equipo(String nombre, String lugarEquipo, int campeonatosGanados, Date fechaInicio, Date fechaFin, String estado) {
        this.nombre = nombre;
        this.lugarEquipo = lugarEquipo;
        this.campeonatosGanados = campeonatosGanados;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }
}

