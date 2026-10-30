package com.example.zy6r_4E_Javier_Diaz_CC7.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreSolicitante;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @ManyToMany
    @JoinColumn(name = "Titulo")
    private Videojuego videojuego;

    public  enum Estado {Activo, Devuelto, Cancelado}
}
