package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "guerreroBean")
public class Guerrero extends Personaje {

	
	@Autowired
	@Qualifier("espadaBean")
	private Arma arma;
	
	@Override
	public void atacar(Personaje atacado) {

		System.out.println("Soy un guerrero y te mataré AAARGGG!!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());

	}

}
