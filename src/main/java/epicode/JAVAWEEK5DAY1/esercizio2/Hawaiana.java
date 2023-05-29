package epicode.JAVAWEEK5DAY1.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hawaiana extends Pizza {
	public Hawaiana() {
		setNome("Hawaiana");
		setPrezzo(getPrezzo() + 3);
		setCalorie(getCalorie() + 700);
		setIngredientiBase(getIngredientiBase() + ", prosciutto, ananas");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
