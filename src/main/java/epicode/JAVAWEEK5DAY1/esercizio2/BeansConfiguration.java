package epicode.JAVAWEEK5DAY1.esercizio2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfiguration {
	@Bean(name = "margherita")
	@Primary
	Margherita margherita() {
		return new Margherita();
	}

	@Bean(name = "hawaiana")
	AnanasExtra hawaiana(Pizza pizza) {
		return new AnanasExtra(pizza);
	}

	@Bean(name = "diavola")
	SalamePiccanteExtra diavola(Pizza pizza) {
		return new SalamePiccanteExtra(pizza);
	}

	@Bean(name = "spigolata")
	Spigolata spigolata() {
		return new Spigolata();
	}

	@Bean(name = "prosciuttoExtra")
	ProsciuttoExtra prosciuttoExtra(Pizza pizza) {
		return new ProsciuttoExtra(pizza);
	}
}
