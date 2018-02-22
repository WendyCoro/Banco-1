/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;

import java.util.*;
import java.sql.*;

public class Inspector {
private int codigo;
private String nombre;
private String direccion;
private String titulo;
private Prestamo prestamo;

   
public Inspector() {
    }
 public Inspector(int codigo, String nombre, String direccion, String titulo, Prestamo prestamo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.titulo = titulo;
        this.prestamo = prestamo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
