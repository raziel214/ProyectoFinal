package excepciones;

public class PartidaYaExisteException extends Exception implements IException {

	/*ublic PartidaYaExisteException(String nombrePartida) {
		super("La partida con el nombre: " + nombrePartida + " ya existe");

	}*/
	private String Mesagge;
	
	@Override
	public String NuevaException() {
		// TODO Auto-generated method stub
		Mesagge="El partida  ya existe";
		return Mesagge;
		
	}

}
