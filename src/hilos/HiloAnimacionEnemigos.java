package hilos;

import interfaz.InterfazSpaceInvaders;
import mundo.Enemigo;
import mundo.InvasorCalamar;
import mundo.InvasorCangrejo;

public class HiloAnimacionEnemigos extends Thread {

	Enemigo enemigo;
	InterfazSpaceInvaders interfaz;
	
	public HiloAnimacionEnemigos(Enemigo invasores, InterfazSpaceInvaders principal) {
		// TODO Auto-generated constructor stub
		
		enemigo = invasores;
		interfaz = principal;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		IImage calamar=new ImageCalamar();
		IImage cangrejo=new ImageCangrejo();
		IImage nave=new ImageNave();
		

		while (interfaz.estaEnFuncionamiento()) {

			if (enemigo instanceof InvasorCalamar) {
				enemigo.setRutaImage(calamar.showImage());
			} 
			else if (enemigo instanceof InvasorCangrejo) {
				enemigo.setRutaImage(cangrejo.showImage());
			} else {
				enemigo.setRutaImage(nave.showImage());
			}

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			enemigo.setRutaImage(enemigo.getRutaImagen2());

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	
}
