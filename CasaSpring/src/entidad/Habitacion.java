package entidad;

public class Habitacion {

	private TipoHabitacion tipo;
	private double metros;

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", metros=" + metros + "]";
	}

	public double getMetros() {
		return metros;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}
	
	

}
