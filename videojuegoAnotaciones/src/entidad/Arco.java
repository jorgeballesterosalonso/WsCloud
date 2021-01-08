package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "arcoBean")
@Scope("prototype")
public class Arco extends Arma {

	@Override
	public void usar() {
		System.out.println("FIUUUUUUUUU");
		System.out.println("Tipo: "+getTipo()+", Daño: "+getDaño());
	}

}
