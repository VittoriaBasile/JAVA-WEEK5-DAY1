package epicode.JAVAWEEK5DAY1.esercizio1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		configWithConfigurationAnnotation();

	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Esercizio1 esercizio1 = (Esercizio1) ctx.getBean("es");
		esercizio1.saluto();
		ctx.close();
	}
}
