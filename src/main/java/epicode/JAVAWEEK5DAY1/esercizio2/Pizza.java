package epicode.JAVAWEEK5DAY1.esercizio2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Pizza {
	private String nome;
	private double prezzo = 2.50;
	private long calorie = 1104;
	private String ingredientiBase = "pomodoro, mozzarella";

}
