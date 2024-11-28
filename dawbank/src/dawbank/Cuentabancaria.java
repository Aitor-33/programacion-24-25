package dawbank;

public class Cuentabancaria {

	private String iban;
	
	private String titular;
	
	private double saldo;
	
	private Movimiento [] movimientos;
	
	private int numeroMovimiento;
	
	private double hacienda = 3000;
	
	public Cuentabancaria(String iban, String titular, double saldo){
		
        this.iban = iban;
        
        this.titular = titular;
        
        this.saldo = saldo;
        
        this.movimientos = new Movimiento[100];
        
        this.numeroMovimiento = 0;
        
        
        
    }

    public String iban(){
    	
        return this.iban;
        
    }

    public String titular(){
    	
        return this.titular;
        
    }

    public double saldo(){
    	
        return this.saldo;
        
    }
	
    public String informacioncuenta(){
    	
        String informacion = String.format("esta es tu cuenta: " + "\n iban - %s \n el titular es: %s \n el saldo es: %s", 
        this.iban, this.titular, this.saldo);
        
        return informacion;
        
    }
    
    public String mostrartitular(){
    	
        String gettitular = String.format("el nombre del titular de la cuenta es: " + this.titular);
        
        return gettitular;
        
    }
    
    public String mostrarsaldo(){
    	
        String getsaldo = String.format("tu saldo actual es: " + this.saldo);
        
        return getsaldo;
        
    }
	
    public String mostrariban(){
    	
        String getiban = String.format("el iban de tu cuenta es: " + this.iban);
        
        return getiban;
        
    }
    
    public String mostrarmovimiento (){
    	
        String infoMovimientos = "";
        
        for(int i = 0; i < numeroMovimiento; i++){
        	
            infoMovimientos += movimientos [i].getInformacion();
            
        }
        
        return infoMovimientos;
        
    }
	
    public boolean Ingreso (Movimiento ingres){
    	
        boolean isAdd = false;
        
        
        if (ingres != null){
        	
            this.movimientos [numeroMovimiento] = ingres;
            
            this.numeroMovimiento ++;
            
            saldo = ingres.getcantidad() + saldo;
            
            isAdd = true;
        } 
        return isAdd;
    }
    
    public boolean Retirada (Movimiento retira){
    	
        boolean isAdd = false;
        
        if (retira != null){
        	
            if ((saldo - retira.getcantidad()) < -50) {
            	
                System.out.println("no tienes saldo suficiente, haz un ingrso o una retirada igual o menor a tu saldo");
            
            }else if((saldo - retira.getcantidad()) > -50){
            	
                saldo = saldo - retira.getcantidad();
                
                if (saldo > -50 && saldo < 0) {
                	
                System.out.println("tu saldo es negativo " + "tu saldo es: " + this.saldo);   
                
                }
                
                this.movimientos [numeroMovimiento] = retira;
                
                this.numeroMovimiento ++;
                
                isAdd = true;
                
            }
            
        }
        
        return isAdd;
    }
	
	
	
	
	
	
	
}
