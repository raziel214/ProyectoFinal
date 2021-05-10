package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import interfaz.InterfazSpaceInvaders;
import mundo.NaveJugador;
import mundo.SpaceInvaders;

/**
 * 
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class Teclado implements KeyListener {

	
	private final Set<Integer> pressedKeys = new HashSet<>();
	
	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------

	// public Partida actu;

	private SpaceInvaders actu;

	public NaveJugador navesita;

	public InterfazSpaceInvaders interfaz;

	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	public Teclado(InterfazSpaceInvaders principal, SpaceInvaders actual) {
		// TODO Auto-generated constructor stub
		interfaz = principal;
		actu = actual;
		navesita = actu.getJugadorActual();

	}

	@Override
	public synchronized void keyPressed(KeyEvent e) {
		pressedKeys.add(e.getKeyCode());
		if (actu.getEnFuncionamiento() && !pressedKeys.isEmpty()) {

			navesita = actu.getJugadorActual();		
			int keyCode;
			
			for (Iterator<Integer> it = pressedKeys.iterator(); it.hasNext();) {
			
				keyCode = it.next();
				
				if (keyCode == KeyEvent.VK_SPACE) {

					if (navesita.getDisparoUno() == null) {
						navesita.disparar(interfaz.darPosActualJugador(), 410);
						interfaz.startHiloJugador();
					}
				}

				if (keyCode == KeyEvent.VK_LEFT) {
					navesita.mover(-1);
					interfaz.getPanelNivel().updateUI();
				}

				if (keyCode == KeyEvent.VK_RIGHT) {
					navesita.mover(1);
					interfaz.getPanelNivel().updateUI();
				}
			}
			
		}

		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			interfaz.cerrar();
		}
		
		if (e.getKeyCode() == KeyEvent.VK_P) {
			if (interfaz.estaEnPausa()) {
				interfaz.modificarFuncionamiento(true);
				interfaz.cambiarPausa(false);
				interfaz.iniciarTodosLosHilos();
			} else {
				interfaz.modificarFuncionamiento(false);
				interfaz.cambiarPausa(true);
			}
		}
	}

    @Override
    public synchronized void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());

    }

	/**
	 * 
	 */
	public void keyTyped(KeyEvent e) {

	}

}