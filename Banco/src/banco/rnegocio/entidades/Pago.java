/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;

/**
 *
 * @author WILCXMAC
 */
import java.util.*;
import java.sql.*;
import java.util.Date;
public class Pago {
    private int id_pago;
    private Date fecha;
    private int valor;
    private Prestamo prestamo;

    public Pago() {
    }

    public Pago(int id_pago, Date fecha, int valor, Prestamo prestamo) {
        this.id_pago = id_pago;
        this.fecha = fecha;
        this.valor = valor;
        this.prestamo = prestamo;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
}

