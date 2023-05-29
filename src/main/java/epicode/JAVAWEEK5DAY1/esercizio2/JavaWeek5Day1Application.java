package epicode.JAVAWEEK5DAY1.esercizio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JavaWeek5Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaWeek5Day1Application.class, args);
		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				epicode.JAVAWEEK5DAY1.esercizio2.BeansConfiguration.class);
		Margherita pizza1 = (Margherita) ctx.getBean("margherita");
		SalamePiccanteExtra pizza2 = new SalamePiccanteExtra(pizza1);
		AnanasExtra pizza3 = new AnanasExtra(pizza1);
		Spigolata pizza4 = (Spigolata) ctx.getBean("spigolata");

		log.info(pizza1.toString());
		log.info(pizza2.toString());
		log.info(pizza3.toString());
		log.info(pizza4.toString());

		ProsciuttoExtra pizza5 = new ProsciuttoExtra(pizza2);
		log.info(pizza5.toString());

		ctx.close();
	}
}
