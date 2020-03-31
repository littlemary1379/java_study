package stars.terran;

import stars.Behavior;

public abstract class Terran implements Behavior{
	@Override
	public void move() {
		System.out.println("이동");
		
	}
	@Override
	public void repair() {
		System.out.println("SCV 치료");
		
	}

	public static void upgrade() {
		System.out.println("업그레이드가 완료되었습니다.");
		Marine.attack++;
		Tank.attack++;
		
	}
}