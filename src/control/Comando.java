package control;

public abstract class Comando {

	public Teclado teclado;
	
	public Comando(Teclado teclado) {
		super();
		this.teclado = teclado;
	}

	public abstract void execute();
	
}
