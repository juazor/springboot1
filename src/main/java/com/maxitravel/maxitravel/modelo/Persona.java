package com.maxitravel.maxitravel.modelo;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre",nullable=false,length=50)
    private String nombre;
    @Column(name="dni",nullable=false,length=8)
    private Integer dni;
    @Column(name="email",nullable=false,length=50)
    private String email;
    @Column(name="telefono",nullable=false,length=9)

    private String telefono;
    
    public Integer getDni() {
        return dni;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



}
