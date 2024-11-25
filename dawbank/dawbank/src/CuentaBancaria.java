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

public String getiban(){
    
    return this.iban;

}

public String gettitular(){

    return this.titular;

}

public double getsaldo(){

    return this.saldo;

}  

public boolean ingreso(movimientos m1){

    boolean isAdd = false;

    if(m1 != null){
        
        this.movimiento[nelementos] = m1;

        this.nelementos++;

        isAdd = true;

    }
    
    return isAdd;
    
}

public boolean retirada(movimientos m1){

    boolean isRemoved = false;

    if(m1 != null){

        int index = -1;

        for(int i = 0; i < this.movimiento.length; i++){

            if(this.movimiento[i] != null){
                
                index = i;
                
            }
        }
        if(index != -1){

            this.movimiento[index] = null;

            isRemoved = true;
            
            for(int i = index+1; i < this.movimiento.length; i++){

                this.movimiento[i-1] = this.movimiento[i];

            }

            this.movimiento[this.movimiento.length-1] = null;

            this.nelementos--;

        }
    }

    return isRemoved;

}




}
