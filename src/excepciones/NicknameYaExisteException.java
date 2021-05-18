package excepciones;

public class NicknameYaExisteException extends Exception implements IException {

	public NicknameYaExisteException(String nombre) {
		super("El jugador con el nombre " + nombre + " ya existe");
	}
	
	@Override
	public String NuevaExcepcion() {
		String Mesage;
		// TODO Auto-generated method stub
		Mesage="El usuario Ingresado ya existe";
		return Mesage;
	}
}
