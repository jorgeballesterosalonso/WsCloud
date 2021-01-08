package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "varitaBean")
@Scope("prototype")
public class Varita extends Arma {

	@Override
	public void usar() {
		System.out.println("fiiiiiiii");
		System.out.println("Tipo: " + getTipo() + ", Daño: " + getDaño());
	}

}
