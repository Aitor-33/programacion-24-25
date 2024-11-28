package dawbank;

import java.time.LocalDateTime;

public class Movimiento {
	
	 	private static int conta = 0;
	 	
	    private int identificador;
	    
	    private LocalDateTime fecha;
	    
	    private String tipo;
	    
	    private double cantidad;
	    
	    
	    public Movimiento(String tipo, double cantidad){
	        
	    	this.identificador = this.conta;
	        
	    	this.conta ++;

	        this.fecha = LocalDateTime.now();
	        
	        this.tipo = tipo;
	        
	        this.cantidad = cantidad;
	        
	    }

	    public int getContador(){
	    	
	        return conta;
	        
	    }

	    public int getidentificador(){
	    	
	        return this.identificador;
	        
	    }

	    public String getTipo(){
	    	
	        return this.tipo;
	        
	    }
	    
	    public double getCantidad(){
	    	
	        return this.cantidad;
	        
	    }

	    public String getInformacion(){
	    	
	        String getmovimiento = String.format("ID: %s, fecha: %s, tipo de la operacion requerida: %s, cantidad a ingrsae: %s €", this.identificador, this.fecha, this.tipo, this.cantidad );
	        
	        return getmovimiento;

	    }

	    
}
