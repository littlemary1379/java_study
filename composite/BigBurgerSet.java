package composite;

import lombok.Data;

@Data

//자바는 다중 상속이 안됨
//상속은 다형성+재사용
//둘 중 하나라도 충족하지 않으면 콤포지션(재사용)
public class BigBurgerSet {
	private Bigburger bigburger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	public BigBurgerSet() {
		this(
			new Bigburger(),
			new Coke(),
			new FrenchFried()
		);
	}
	public BigBurgerSet(Bigburger bigburger2) {
		this.getBigburger();
		
	}


	
	
	public BigBurgerSet(Bigburger bigburger, Coke coke, FrenchFried frenchFried) {
		this.bigburger = bigburger;
		this.coke = coke;
		this.frenchFried = frenchFried;	
	}

	
}
