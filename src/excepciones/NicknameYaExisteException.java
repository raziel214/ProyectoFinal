package excepciones;

public class NicknameYaExisteException extends Exception implements IException {
	
	private String Mesage;

	@Override
	public String NuevaException() {
		// TODO Auto-generated method stub
		Mesage="El Nick name ya existe";
		return Mesage;
		
	}

	
}
