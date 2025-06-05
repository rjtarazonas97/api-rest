package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String nombre;
    private String email;
    private Integer prioridad;

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }
    public Integer getPrioridad(){
        return prioridad;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
