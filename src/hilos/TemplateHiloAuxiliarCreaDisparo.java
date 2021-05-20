package hilos;

import interfaz.InterfazSpaceInvaders;
import mundo.Partida;

public class TemplateHiloAuxiliarCreaDisparo extends Hilo {

	private Partida partidaEnemigos;

	public TemplateHiloAuxiliarCreaDisparo(Partida a, InterfazSpaceInvaders principal) {
		super(principal);
		partidaEnemigos = a;
	}

	@Override
	public void correrHilo() {
		// TODO Auto-generated method stub

		while (interfaz.estaEnFuncionamiento()) {

			int fila = (int) (Math.random() * 4);
			int columna = (int) (Math.random() * 9);

			if (partidaEnemigos.getEnemigos()[fila][columna] != null) {
				partidaEnemigos.getEnemigos()[fila][columna].disparar(
						partidaEnemigos.getEnemigos()[fila][columna].getPosX(),
						partidaEnemigos.getEnemigos()[fila][columna].getPosY());
			}

			try {
				sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
