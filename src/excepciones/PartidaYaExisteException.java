package excepciones;

public class PartidaYaExisteException extends Exception implements IException{

	public PartidaYaExisteException(String nombrePartida) {
		super("La partida con el nombre: " + nombrePartida + " ya existe");

	}

	@Override
	public String NuevaExcepcion() {
		String Mesage;
		// TODO Auto-generated method stub
		Mesage="La partida ya existe";
		return Mesage;
	}
}
