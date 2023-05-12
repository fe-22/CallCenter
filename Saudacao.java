package attendant;

import java.security.PublicKey;
import java.util.Calendar;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Saudacao {
	
	private  String saudacao; 
		
	
	public Saudacao() {
	Calendar calendario = Calendar.getInstance();
	
	int hora = calendario.get(Calendar.HOUR_OF_DAY);
	
	
	if(hora >= 6 && hora <= 12) {
		System.out.println("Bom Dia!");
		
	}else if (hora >= 12 && hora <= 18 ) {
		System.out.println("Boa Tarde!");
		
	}else {
		System.out.println("Boa Noite!");
	}
	
	
	}
     public String getSaudacao() {
	     return saudacao;
	
		
	}
     @Override
     public String toString() {
    	 return saudacao;
     }

}
