package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		//BigBurgerSet �߰�
		BigBurgerSet set1=new BigBurgerSet();
		//���� �߰�
		Burger burger1=new Burger();
		//�ݶ� �߰�
		Coke coke1=new Coke();
		//����� ��Ʈ �߰�+���� 1000�� ���� ����
		new BigBurgerSet(
				new Bigburger(3000,"����� ����"),
				new Coke(),
				new FrenchFried()
		);
		BigBurgerSet set3=
				new BigBurgerSet(
						new Bigburger(2000, "����� ����")
				);
		
		ShrimpBurgerSet set4=
				new ShrimpBurgerSet(
						new ShrimpBurger()
				);
				
	}
}
