package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "espadaBean")
@Scope("prototype")
public class Espada extends Arma {

	@Override
	public void usar() {
		System.out.println("SWIIIING");
		System.out.println("Tipo: " + getTipo() + ", Daño: " + getDaño());
	}

}
