package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Cliente;

@SpringBootApplication
public class Ejercicio1BootApplication {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Ejercicio1BootApplication.class, args);
		Cliente c = context.getBean("cliente", Cliente.class);
		Cliente c2 = context.getBean("cliente", Cliente.class);

		c.setApellidos("Jiménez");
		c.getPedido().setId("846512");
		c.getPedido().setPrecio(82.99);

		System.out.println(c);

		c2.setNombre("Carlos");
		c2.getPedido().setId("65123031");
		c2.getPedido().setPrecio(25.85);

		System.out.println(c2);
	}

}
