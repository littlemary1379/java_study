package stars.zerg;

import stars.Behavior;

public abstract class Zerg implements Behavior{

	@Override
	public void move() {
		System.out.println("�̵�");
	}
	
	@Override
	public void repair() {
		System.out.println("�ڿ� ġ��");
		
	}
	public static void upgrade() {
		System.out.println("���׷��̵尡 �Ϸ�Ǿ����ϴ�.");
		Hydra.attack++;
		Ultra.attack++;
		
	}
}