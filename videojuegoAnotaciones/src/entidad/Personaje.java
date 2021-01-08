package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Personaje {
	private int vida;
	private String nombre;
	@Autowired
	@Qualifier("espadaBean")
	private Arma arma;

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void atacar(Personaje atacado) {
		// TODO Auto-generated method stub

	}

}
