package controlador;

import java.util.Arrays;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Personaje;

public class MainVideojuegoSpring {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/Context.xml");

		Personaje arquero = context.getBean("arqueroBean", Personaje.class);
		Personaje mago = context.getBean("magoBean", Personaje.class);
		Personaje guerrero = context.getBean("guerreroBean", Personaje.class);
		Personaje curandero = context.getBean("curanderoBean", Personaje.class);

		Random rm = new Random();

		// Comienza la batalla
		while (guerrero.getVida() >= 0 || arquero.getVida() >= 0 || curandero.getVida() >= 0 || mago.getVida() >= 0) {

			Personaje[] lista = { guerrero, curandero, mago, arquero };

			// ataca el guerrero

			Personaje atacado = lista[rm.nextInt(4)];
			guerrero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el arquero
			atacado = lista[rm.nextInt(4)];
			arquero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el mago
			atacado = lista[rm.nextInt(4)];
			mago.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el curandero
			atacado = lista[rm.nextInt(4)];
			curandero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

		}
		int[] vidas = { guerrero.getVida(), arquero.getVida(), mago.getVida(), curandero.getVida() };

		Arrays.sort(vidas);

		System.out.println("------------------------------------------");
		System.out.println("Vida restante del arquero: " + arquero.getVida());
		System.out.println("Vida restante del mago: " + mago.getVida());
		System.out.println("Vida restante del curandero: " + curandero.getVida());
		System.out.println("Vida restante del guerrero: " + guerrero.getVida());

		if (vidas[0] == guerrero.getVida()) {
			System.out.println("Ha ganado el guerrero!!");

		} else if (vidas[0] == arquero.getVida()) {
			System.out.println("Ha ganado el arquero!!");

		} else if (vidas[0] == mago.getVida()) {
			System.out.println("Ha ganado el mago!!");

		} else if (vidas[0] == curandero.getVida())
			System.out.println("Ha ganado el curandero!!");
	}

}
