package mundo;

import mundo.enums.TipoEnemigoEnum;

public class EnemigoFactory {

	public static Enemigo getInstance(Nivel nivel, int j, int i, TipoEnemigoEnum tipoEnemigo) {
		
		switch (tipoEnemigo) {
		case INVASOR_CALAMAR:{
			return new InvasorCalamar(nivel.getVelocidadEnemigos(), (j * nivel.getPosXPrimerEnemigo() + nivel.getPosXPrimerEnemigo()),
					(nivel.getPosYPrimerEnemigo()), nivel.getVidaEnemigos(), nivel.getAnchoEnemigos(), nivel.getAltoEnemigos(),
					Enemigo.DERECHA, "./data/imagenes/Naves/s0.png", "./data/imagenes/Naves/s1.png");
			}
		case INVASOR_CANGREJO:{
			return new InvasorCangrejo(nivel.getVelocidadEnemigos(), (j * nivel.getPosXPrimerEnemigo() + nivel.getPosXPrimerEnemigo()),
					(i * nivel.getPosYPrimerEnemigo() + nivel.getPosYPrimerEnemigo()), nivel.getVidaEnemigos(), nivel.getAnchoEnemigos(), 
					nivel.getAltoEnemigos(), Enemigo.DERECHA, "./data/imagenes/Naves/p0.png", "./data/imagenes/Naves/p1.png");
			}
		case INVASOR_PULPO:{
			return new InvasorPulpo(nivel.getVelocidadEnemigos(), (j * nivel.getPosXPrimerEnemigo() + nivel.getPosXPrimerEnemigo()), 
					(i * nivel.getPosYPrimerEnemigo() + nivel.getPosYPrimerEnemigo()), nivel.getVidaEnemigos(), nivel.getAnchoEnemigos(), 
					nivel.getAltoEnemigos(), Enemigo.DERECHA, "./data/imagenes/Naves/r0.png", "./data/imagenes/Naves/r1.png");
			}
		}
		return null;
	}
}
