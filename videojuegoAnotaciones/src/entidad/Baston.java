package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "bastonBean")
@Scope("prototype")
public class Baston extends Arma{

	@Override
	public void usar() {
		System.out.println("pipipipiii");
		System.out.println("Tipo: "+getTipo()+", Daño: "+getDaño());
	}
	
}
