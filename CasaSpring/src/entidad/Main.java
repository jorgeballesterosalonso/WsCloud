package entidad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext context = null;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/Context.xml");
		
		Casa casitaDelCampo = (Casa) context.getBean("Casita");
		System.out.println(casitaDelCampo);
	}

}
