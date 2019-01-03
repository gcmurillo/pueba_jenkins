package practica;

public class Prima {

	public int getPrima(String edad, String estado, String sexo) {
		
		int prima = 200;
		
		int ed = 0;
		
		ed = this.isInt(edad);
		
		if (ed < 18 || ed > 80) {
			return -1;
		}
		
		if (!sexo.equals("h") && !sexo.equals("m")) {
			return -1;
		}
		
		if (!estado.equals("soltero") && !estado.equals("casado") 
				&& !estado.equals("viudo") && !estado.equals("divorciado")) {
			return -1;
		}
		
		if (ed < 29) {
			prima += 200;
			if (sexo.equals("h")) {
				prima += 100;
			}
		}
		
		if (estado.equals("soltero")) {
			prima += 100;
		}
		
		if (ed > 60) {
			prima += 100;
		}
		
		return prima;
		
	}
	
	public int isInt(String number) {
		
		int d;
		try  
		  {  
		    d = Integer.parseInt(number);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return -1;  
		  }  
		  return d;  
		
	}
	
}
