package control;

public class KeySalir extends Comando{

	public KeySalir(Teclado teclado) {
		super(teclado);
	}
	
	@Override
	public void execute() {
		teclado.getInterfaz().cerrar();
	}

}
