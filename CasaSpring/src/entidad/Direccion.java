package entidad;

public class Direccion {
	private String tipoVia;
	private String calle;
	private String cp;
	private int numero;

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", calle=" + calle + ", cp=" + cp + ", numero=" + numero + "]";
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
