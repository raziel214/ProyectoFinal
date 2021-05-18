package excepciones;

public class MonedasInsuficientesException extends Exception implements IException{

	String Mesage;

	
	public String NuevaExcepcion() {
		// TODO Auto-generated method stub
		Mesage="El usuario No tiene monedas suficientes";
		return Mesage;
	}
	
	

}
