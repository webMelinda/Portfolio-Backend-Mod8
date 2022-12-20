/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.portfolio.Web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private String second_name;
    
    private String apellido;
    
    private String titulo;
    
    private String banner_img;
    
    private String perfil_img;
    
    private String about;
    
    @Lob
    private int edad;
    
    private String residencia;
    
    private String email;
    

    public Persona() {
    }

    public Persona(int id, String nombre, String second_name, String apellido, String titulo, String banner_img, String perfil_img, String about, int edad, String residencia, String email) {
        this.id = id;
        this.nombre = nombre;
        this.second_name = second_name;
        this.apellido = apellido;
        this.titulo = titulo;
        this.banner_img = banner_img;
        this.perfil_img = perfil_img;
        this.about = about;
        this.edad = edad;
        this.residencia = residencia;
        this.email = email;
    }

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

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }

    public String getPerfil_img() {
        return perfil_img;
    }

    public void setPerfil_img(String perfil_img) {
        this.perfil_img = perfil_img;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
