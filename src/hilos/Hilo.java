package hilos;

import interfaz.InterfazSpaceInvaders;

public abstract class Hilo extends Thread{

	
	InterfazSpaceInvaders interfaz;
	
	public Hilo(InterfazSpaceInvaders interfaz) {
		super();
		this.interfaz = interfaz;
	}
	
	@Override
	public void run() {
		correrHilo();
	}
	
	public abstract void correrHilo();
	
	
	protected void llamarHiloPadre(){
		super.run();
	}
}
