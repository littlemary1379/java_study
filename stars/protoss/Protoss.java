package stars.protoss;

import stars.Behavior;


public abstract class Protoss implements Behavior {
	@Override
	public void move() {
		System.out.println("�̵�");
	}

	@Override
	public void repair() {
		System.out.println("�ǵ� ġ��");

	}
	public static void upgrade() {
		System.out.println("���׷��̵尡 �Ϸ�Ǿ����ϴ�.");
		Zealot.attack++;
		Dragoon.attack++;
	}
	abstract public int getsh();
	
	abstract public void setsh(int sh);

}
