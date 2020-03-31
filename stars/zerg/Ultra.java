package stars.zerg;

import stars.Behavior;

public class Ultra extends Zerg implements Behavior{
	private String name;
	private int hp;
	public static int attack=50;
	
	public Ultra(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void attack(Behavior unit) {
		System.out.println("근거리 받기 공격");
		
	}
	@Override
	public int getattack() {
		return attack;
	}
	@Override
	public void setattack(int attack) {
		Hydra.attack=attack;
	}
	@Override
	public int gethp() {
		return hp;
	}
	@Override
	public void sethp(int hp) {
		this.hp=hp;
		
	}
	
}
