package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		//BigBurgerSet 추가
		BigBurgerSet set1=new BigBurgerSet();
		//버거 추가
		Burger burger1=new Burger();
		//콜라 추가
		Coke coke1=new Coke();
		//빅버거 세트 추가+버거 1000원 할인 쿠폰
		new BigBurgerSet(
				new Bigburger(3000,"빅버거 할인"),
				new Coke(),
				new FrenchFried()
		);
		BigBurgerSet set3=
				new BigBurgerSet(
						new Bigburger(2000, "빅버거 할인")
				);
		
		ShrimpBurgerSet set4=
				new ShrimpBurgerSet(
						new ShrimpBurger()
				);
				
	}
}
