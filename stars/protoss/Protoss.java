package stars.protoss;

import stars.Behavior;


public abstract class Protoss implements Behavior {
	@Override
	public void move() {
		System.out.println("이동");
	}

	@Override
	public void repair() {
		System.out.println("실드 치료");

	}
	public static void upgrade() {
		System.out.println("업그레이드가 완료되었습니다.");
		Zealot.attack++;
		Dragoon.attack++;
	}
	abstract public int getsh();
	
	abstract public void setsh(int sh);

}
