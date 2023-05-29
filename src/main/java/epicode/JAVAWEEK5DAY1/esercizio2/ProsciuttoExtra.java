package epicode.JAVAWEEK5DAY1.esercizio2;

public class ProsciuttoExtra extends IngredientiExtraDecorator {

	public ProsciuttoExtra(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {

		return pizza.getNome() + " con aggiunta di Extra Prosciutto";
	}

	@Override
	public double getPrezzo() {

		return pizza.getPrezzo() + 0.50;
	}

	@Override
	public long getCalorie() {

		return pizza.getCalorie() + 200;
	}

	@Override
	public String getIngredientiBase() {

		return pizza.getIngredientiBase() + " , prosciutto extra";
	}

	@Override
	public String toString() {
		return "Pizza con Prosciutto Extra [Nome Pizza= " + getNome() + ", Prezzo= " + getPrezzo() + ", Calorie= "
				+ getCalorie() + ", Ingredienti= " + getIngredientiBase() + "]";
	}

	@Override
	public String setNome() {
		return null;
	}

}
