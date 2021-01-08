package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "magoBean")
@Scope("prototype")
public class Mago extends Personaje{

	@Autowired
	@Qualifier("varitaBean")
	private Arma arma;
	@Override
	public void atacar(Personaje atacado) {
		
		System.out.println("Soy un mago y te voy a hechizar!!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());
	}

}
