package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "arqueroBean")
@Scope("prototype")
public class Arquero extends Personaje {
	
	@Autowired
	@Qualifier("arcoBean")
	private Arma arma;

	@Override
	public void atacar(Personaje atacado) {
		System.out.println("Soy un arquero y te mataré AAAAAAAAAA");
		getArma().usar();
		atacado.setVida(atacado.getVida() - getArma().getDaño());
	}

}
