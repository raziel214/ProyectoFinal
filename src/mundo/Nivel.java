package mundo;

import java.io.Serializable;

/**
 * 
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class Nivel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int CANTIDAD_CALAMAR = 10;
	public static final int CANTIDAD_PULPO = 20;
	public static final int CANTIDAD_CANGREJO = 20;

	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------

	public static class NivelBuilder{
		
		private Nivel nivel;
		
		public NivelBuilder() {
			this.nivel = new Nivel();
		}
		
		public Nivel build() {
			return this.nivel;
		}
		
		public NivelBuilder setVelocidadEnemigos(int velocidadEnemigos) {
			this.nivel.setVelocidadEnemigos(velocidadEnemigos);
			return this;
		}

		public NivelBuilder setVidaEnemigos(int vidaEnemigos) {
			this.nivel.setVidaEnemigos(vidaEnemigos);
			return this;
		}

		/**
		 * 
		 * @param nivel
		 */
		public NivelBuilder setNivel(String nivel) {
			this.nivel.setNivel(nivel);
			return this;
		}

		/**
		 * 
		 * @param enemigos
		 */
		public NivelBuilder setEnemigos(int enemigos) {
			this.nivel.setEnemigos(enemigos);
			return this;
		}

		/**
		 * 
		 * @param posXPrimerEnemigo
		 */
		public NivelBuilder setPosXPrimerEnemigo(int posXPrimerEnemigo) {
			this.nivel.setPosXPrimerEnemigo(posXPrimerEnemigo);
			return this;
		}

		/**
		 * 
		 * @param posYPrimerEnemigo
		 */
		public NivelBuilder setPosYPrimerEnemigo(int posYPrimerEnemigo) {
			this.nivel.setPosYPrimerEnemigo(posYPrimerEnemigo);
			return this;
		}

		/**
		 * 
		 * @param anchoEnemigos
		 */
		public NivelBuilder setAnchoEnemigos(int anchoEnemigos) {
			this.nivel.setAnchoEnemigos(anchoEnemigos);
			return this;
		}

		/**
		 * 
		 * @param altoEnemigos
		 */
		public NivelBuilder setAltoEnemigos(int altoEnemigos) {
			this.nivel.setAltoEnemigos(altoEnemigos);
			return this;
		}

	}
	

	private String nivel;

	private int velocidadEnemigos;

	private int enemigos;

	private int vidaEnemigos;

	private int posXPrimerEnemigo;

	private int posYPrimerEnemigo;

	private int anchoEnemigos;

	private int altoEnemigos;


	public static NivelBuilder nivelBuilder() {
		return new NivelBuilder();
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getVelocidadEnemigos() {
		return velocidadEnemigos;
	}

	private void setVelocidadEnemigos(int velocidadEnemigos) {
		this.velocidadEnemigos = velocidadEnemigos;
	}

	public int getEnemigos() {
		return enemigos;
	}

	private void setEnemigos(int enemigos) {
		this.enemigos = enemigos;
	}

	public int getVidaEnemigos() {
		return vidaEnemigos;
	}

	private void setVidaEnemigos(int vidaEnemigos) {
		this.vidaEnemigos = vidaEnemigos;
	}

	public int getPosXPrimerEnemigo() {
		return posXPrimerEnemigo;
	}

	private void setPosXPrimerEnemigo(int posXPrimerEnemigo) {
		this.posXPrimerEnemigo = posXPrimerEnemigo;
	}

	public int getPosYPrimerEnemigo() {
		return posYPrimerEnemigo;
	}

	private void setPosYPrimerEnemigo(int posYPrimerEnemigo) {
		this.posYPrimerEnemigo = posYPrimerEnemigo;
	}

	public int getAnchoEnemigos() {
		return anchoEnemigos;
	}

	private void setAnchoEnemigos(int anchoEnemigos) {
		this.anchoEnemigos = anchoEnemigos;
	}

	public int getAltoEnemigos() {
		return altoEnemigos;
	}

	private void setAltoEnemigos(int altoEnemigos) {
		this.altoEnemigos = altoEnemigos;
	}
}