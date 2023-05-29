package epicode.JAVAWEEK5DAY1.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Margherita extends Pizza {

	public Margherita() {
		setNome("Margherita");
		getPrezzo();
		getCalorie();
		getIngredientiBase();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
