package org.example;

import java.util.LinkedList;

public class CuentaBancaria {
    private Cliente clienteNuevo;
    private String iban;
    private double saldo;
    private LinkedList<Movimiento> movimientos = new LinkedList<>();

    private int contadorMovimiento = 0;

    public CuentaBancaria(Cliente clienteNuevo, String iban) {

        this.clienteNuevo = clienteNuevo;
        this.iban = iban;
        this.saldo = 0.0;
        this.movimientos = new LinkedList<>();

    }


    public Cliente getClienteNuevo() {
        return clienteNuevo;
    }


    public String getIban() {

        return this.iban;

    }

    public double getSaldo() {

        return this.saldo;

    }

    public boolean ingresar(double cantidad)throws AvisarHaciendaException, CuentaException{

        if (cantidad >= 3000) {
            throw new AvisarHaciendaException("tendras que notificar ha hacienda de este movimiento");
        }
        if (cantidad <= 0) {
            throw new CuentaException("la cantidad debe de ser mayor que 0");
        }
        boolean isOk = false;
        Movimiento m = new Movimiento(Tipo.Ingreso, cantidad);
        this.saldo = this.saldo + m.getCantidad();
        this.registrarMovimiento();
        isOk = true;
        return isOk;

    }

    public boolean retirar(double cantidad)throws CuentaException{

        boolean isOk = false;

        if (cantidad <= 0) {

            throw new CuentaException("la cantidad debe de ser mayor que 0");
        }

        if(this.saldo - cantidad > -50){

            Movimiento m = new Movimiento(Tipo.Retirada, cantidad);
            this.saldo = this.saldo - m.getCantidad();
            this.registrarMovimiento();
            isOk = true;

        }

        return isOk;

    }

    public void registrarMovimiento(){

        contadorMovimiento++;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("CuentaBancaria ");
        sb.append(" clienteNuevo= ").append(clienteNuevo);
        sb.append(", iban= ").append(iban);
        sb.append(", saldo= ").append(saldo);
        sb.append(", numero de movimientos= ").append(contadorMovimiento);

        return sb.toString();
    }
}
