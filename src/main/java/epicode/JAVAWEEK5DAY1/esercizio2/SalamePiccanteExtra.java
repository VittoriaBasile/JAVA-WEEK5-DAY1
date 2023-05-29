package epicode.JAVAWEEK5DAY1.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalamePiccanteExtra extends IngredientiExtraDecorator {

	public SalamePiccanteExtra(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return pizza.getNome();
	}

	@Override
	public double getPrezzo() {

		return pizza.getPrezzo() + 2.50;
	}

	@Override
	public long getCalorie() {

		return pizza.getCalorie() + 200;
	}

	@Override
	public String getIngredientiBase() {

		return pizza.getIngredientiBase() + " , salame piccante";
	}

	@Override
	public String toString() {
		return "Nome pizza=" + "Diavola" + ", Prezzo()=" + getPrezzo() + ", Calorie()=" + getCalorie()
				+ ", Ingredienti=" + getIngredientiBase();
	}

}