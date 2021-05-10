package mundo.enums;

public enum TipoEnemigoEnum {
	INVASOR_CANGREJO("cangrejo"),
	INVASOR_CALAMAR("calamar"),
	INVASOR_PULPO("pulpo");
	
	private String tipo;

	private TipoEnemigoEnum(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}