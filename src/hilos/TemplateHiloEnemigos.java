package hilos;

import interfaz.InterfazSpaceInvaders;
import mundo.Enemigo;

public class TemplateHiloEnemigos extends Hilo {

	Enemigo enemigo;

	public TemplateHiloEnemigos(Enemigo invasores, InterfazSpaceInvaders interfaz) {
		super(interfaz);
		enemigo = invasores;
	}

	@Override
	public void correrHilo() {
		// TODO Auto-generated method stub
		while (interfaz.estaEnFuncionamiento()) {

			if (enemigo.getDireccion() == Enemigo.DERECHA) {
				enemigo.mover(1);
			} else {
				enemigo.mover(-1);
			}
			
			if (enemigo.edge()) {
				enemigo.moverAbajo(2);
				if (enemigo.getDireccion() == Enemigo.DERECHA) {
					enemigo.setDireccion(Enemigo.IZQUIERDA);
				} else {
					enemigo.setDireccion(Enemigo.DERECHA);
				}
			}

			try {
				sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			interfaz.getPanelNivel().updateUI();

			if (enemigo.getDisparoUno() != null) {
				if (enemigo.getDisparoUno().getPosY() >= 420) {
					enemigo.getDisparoUno().setImpacto(true);
					enemigo.eliminarDisparo();
				}
			}

		}

	}

}