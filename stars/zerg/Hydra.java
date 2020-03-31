package stars.zerg;

import stars.Behavior;

public class Hydra extends Zerg implements Behavior{
	private String name;
	private int hp;
	public static int attack=20;
	
	public Hydra(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void attack(Behavior unit) {
		System.out.println("원거리 독성 공격");
		
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
