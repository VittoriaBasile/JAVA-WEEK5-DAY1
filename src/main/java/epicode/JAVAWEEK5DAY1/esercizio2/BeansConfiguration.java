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

	@Bean(name = "spigolata")
	Spigolata spigolata() {
		return new Spigolata();
	}

}
