package control;

public class KeyDisparar extends Comando{

	public KeyDisparar(Teclado teclado) {
		super(teclado);
	}
	
	@Override
	public void execute() {
		if (teclado.getNavesita().getDisparoUno() == null) {
			System.out.println("DISPARO");
			teclado.getNavesita().disparar(teclado.getInterfaz().darPosActualJugador(), 410);
			teclado.getInterfaz().startHiloJugador();
		}
	}

}
