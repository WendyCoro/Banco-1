/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;

import java.util.*;
import java.sql.*;

public class Cuenta_Credito {
    private int n_cuenta;
    private int codigo_cuenta;
    private int saldo;
    private int u_sobregiro;

    public Cuenta_Credito() {
    }

    public Cuenta_Credito(int n_cuenta, int codigo_cuenta, int saldo, int u_sobregiro) {
        this.n_cuenta = n_cuenta;
        this.codigo_cuenta = codigo_cuenta;
        this.saldo = saldo;
        this.u_sobregiro = u_sobregiro;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getCodigo_cuenta() {
        return codigo_cuenta;
    }

    public void setCodigo_cuenta(int codigo_cuenta) {
        this.codigo_cuenta = codigo_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getU_sobregiro() {
        return u_sobregiro;
    }

    public void setU_sobregiro(int u_sobregiro) {
        this.u_sobregiro = u_sobregiro;
    }
}

