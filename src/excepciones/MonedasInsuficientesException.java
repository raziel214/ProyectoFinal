package excepciones;

public class MonedasInsuficientesException  implements IException{
	
	String Mesage;

	@Override
	public String NuevaException() {
		// TODO Auto-generated method stub
		Mesage="No tiene monedas suficientes";
		return Mesage;
		
	}

}
