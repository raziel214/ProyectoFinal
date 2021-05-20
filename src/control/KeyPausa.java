package control;

public class KeyPausa  extends Comando{

	public KeyPausa(Teclado teclado) {
		super(teclado);
	}
	
	@Override
	public void execute() {
		if (teclado.getInterfaz().estaEnPausa()) {
			teclado.getInterfaz().modificarFuncionamiento(true);
			teclado.getInterfaz().cambiarPausa(false);
			teclado.getInterfaz().iniciarTodosLosHilos();
		} else {
			teclado.getInterfaz().modificarFuncionamiento(false);
			teclado.getInterfaz().cambiarPausa(true);
		}
	}

}
