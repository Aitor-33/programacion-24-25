public class CuentaBancaria {

private String iban;
private String titular;
private double saldo;

private movimientos [] movimiento;
private int nelementos;


public CuentaBancaria(String iban, String titular, double saldo, String movimientos, int nmovimientos){

this.iban = iban;
this.titular = titular;
this.saldo = saldo;
this.movimiento = new movimientos[nmovimientos];
this.nelementos = 0;
}







}
