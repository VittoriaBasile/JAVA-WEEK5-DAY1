package epicode.JAVAWEEK5DAY1.esercizio1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean(name = "es")
	public Esercizio1 esercizio() {
		return new Esercizio1();
	}

}
