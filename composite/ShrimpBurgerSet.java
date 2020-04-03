package composite;

import lombok.Data;

@Data

public class ShrimpBurgerSet {
	private ShrimpBurger ShrimpBurger;
	private Coke coke;
	private FrenchFried frenchFried;

	public ShrimpBurgerSet() {
		this(new ShrimpBurger(), new Coke(), new FrenchFried());
	}

	public ShrimpBurgerSet(ShrimpBurger ShrimpBurger2) {
		this.getShrimpBurger();
	}

	public ShrimpBurgerSet(ShrimpBurger ShrimpBurger, Coke coke, FrenchFried frenchFried) {
		this.ShrimpBurger = ShrimpBurger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}

}
