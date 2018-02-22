/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;
import java.util.*;
import java.sql.*;

public class Cliente_Prestamo {
   private int idcliente_prestamo;
   private Cliente cliente;
   private Prestamo prestamo;

    public Cliente_Prestamo() {
    }

    public Cliente_Prestamo(int idcliente_prestamo, Cliente cliente, Prestamo prestamo) {
        this.idcliente_prestamo = idcliente_prestamo;
        this.cliente = cliente;
        this.prestamo = prestamo;
    }

    public int getIdcliente_prestamo() {
        return idcliente_prestamo;
    }

    public void setIdcliente_prestamo(int idcliente_prestamo) {
        this.idcliente_prestamo = idcliente_prestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
   
}

