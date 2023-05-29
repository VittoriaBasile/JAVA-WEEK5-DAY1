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
		Margherita pizza2 = new Margherita();
		AnanasExtra pizza3 = new AnanasExtra(new Margherita());

		SalamePiccanteExtra pizza4 = new SalamePiccanteExtra(pizza2);
		AnanasExtra pizza5 = new AnanasExtra(pizza3);
		SalamePiccanteExtra pizza6 = new SalamePiccanteExtra((Spigolata) ctx.getBean("spigolata"));

		log.info(pizza1.toString());
		log.info(pizza2.toString());
		log.info(pizza3.toString());
		log.info(pizza4.toString());
		log.info(pizza5.toString());
		log.info(pizza6.toString());

		ProsciuttoExtra pizza7 = new ProsciuttoExtra(pizza2);
		log.info(pizza7.toString());

		ctx.close();
	}
}
