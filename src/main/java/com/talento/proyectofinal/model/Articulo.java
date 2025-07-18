package com.talento.proyectofinal.model;

//import org.springframework.stereotype.Indexed;

import jakarta.persistence.*;

public class Articulo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    public Articulo(){}

    public Articulo(Long id, String nombre, Double precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


}
