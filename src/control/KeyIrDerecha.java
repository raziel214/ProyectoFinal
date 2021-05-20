package control;

public class KeyIrDerecha extends Comando{

	public KeyIrDerecha(Teclado teclado) {
		super(teclado);
	}
	
	@Override
	public void execute() {
		System.out.println("VOY DERECHA");
		teclado.getNavesita().mover(1);
		teclado.getInterfaz().getPanelNivel().updateUI();
	}

}