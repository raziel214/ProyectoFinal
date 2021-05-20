package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collections;
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

	
	private static Teclado instance;
//	
	private HistorialComandos historial;
	
//	private final Set<Integer> pressedKeys = new HashSet<>();
	
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
		historial = new HistorialComandos();
	}
	
	public static Teclado getInstance(InterfazSpaceInvaders principal, SpaceInvaders actual) {
		return instance == null ? new Teclado(principal, actual) : instance;
	}
	
	@Override
	public synchronized void keyPressed(KeyEvent e) {
		historial.push(e);
		if (actu.getEnFuncionamiento() && !historial.isEmpty()) {
			
			int keyCode;
			
			for (Iterator<Integer> it = historial.getPressedKeys().iterator(); it.hasNext();) {
			
				keyCode = it.next();
				
				if (keyCode == KeyEvent.VK_SPACE) {
					new KeyDisparar(Teclado.getInstance(interfaz, actu)).execute();
				}

				if (keyCode == KeyEvent.VK_LEFT) {
					new KeyIrIzquierda(Teclado.getInstance(interfaz, actu)).execute();
				}

				if (keyCode == KeyEvent.VK_RIGHT) {
					new KeyIrDerecha(Teclado.getInstance(interfaz, actu)).execute();
				}
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			new KeySalir(Teclado.getInstance(interfaz, actu)).execute();
		}
		
		if (e.getKeyCode() == KeyEvent.VK_P) {
			new KeyPausa(Teclado.getInstance(interfaz, actu)).execute();
		}
	}


    @Override
    public synchronized void keyReleased(KeyEvent e) {
        historial.pop(e);

    }

	public NaveJugador getNavesita() {
		return navesita;
	}

	public InterfazSpaceInvaders getInterfaz() {
		return interfaz;
	}

	/**
	 * 
	 */
	public void keyTyped(KeyEvent e) {

	}

}