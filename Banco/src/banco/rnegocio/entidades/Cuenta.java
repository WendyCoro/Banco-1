/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;
import java.util.*;
import java.sql.*;

public class Cuenta {
private int codigo_cuenta;
private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(int codigo_cuenta, Cliente cliente) {
        this.codigo_cuenta = codigo_cuenta;
        this.cliente = cliente;
    }

    public int getCodigo_cuenta() {
        return codigo_cuenta;
    }

    public void setCodigo_cuenta(int codigo_cuenta) {
        this.codigo_cuenta = codigo_cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
