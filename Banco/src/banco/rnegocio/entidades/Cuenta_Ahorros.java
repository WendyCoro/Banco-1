/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.rnegocio.entidades;

import java.util.*;
import java.sql.*;

public class Cuenta_Ahorros {
   private int n_cuenta;
   private Cuenta cuenta;
   private int saldo;
   private int interes;

    public Cuenta_Ahorros() {
    }

    public Cuenta_Ahorros(int n_cuenta, Cuenta cuenta, int saldo, int interes) {
        this.n_cuenta = n_cuenta;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
   
    
}

