package entidad;

import java.util.ArrayList;

public class Casa {

	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private double metros;

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + ", metros=" + getMetros() + "]";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public double getMetros() {
		double Metros = 0;
		for (Habitacion habitacion : habitaciones) {
			Metros += habitacion.getMetros();
		}
		metros = Metros;
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

}
