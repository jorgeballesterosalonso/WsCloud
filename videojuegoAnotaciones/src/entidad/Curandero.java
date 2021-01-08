package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "curanderoBean")
@Scope("prototype")
public class Curandero extends Personaje{

	@Autowired
	@Qualifier("bastonBean")
	private Arma arma;
	
	@Override
	public void atacar(Personaje atacado) {
		System.out.println("Soy un curandero y te voy a descurar!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());
	}

}
