package epicode.JAVAWEEK5DAY1.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Diavola extends Pizza {
	public Diavola() {
		setNome("Diavola");
		setPrezzo(getPrezzo() + 2);
		setCalorie(getCalorie() + 500);
		setIngredientiBase(getIngredientiBase() + ", salame piccante");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
