package control;

public class KeyIrIzquierda extends Comando{

	public KeyIrIzquierda(Teclado teclado) {
		super(teclado);
	}
	
	@Override
	public void execute() {
		System.out.println("VOY IZQUIERDA");
		teclado.getNavesita().mover(-1);
		teclado.getInterfaz().getPanelNivel().updateUI();
	}

}
