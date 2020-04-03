package composite;

import lombok.Data;

@Data

//�ڹٴ� ���� ����� �ȵ�
//����� ������+����
//�� �� �ϳ��� �������� ������ ��������(����)
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
