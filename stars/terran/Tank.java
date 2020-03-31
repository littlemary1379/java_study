package stars.terran;

import stars.Behavior;

public class Tank extends Terran implements Behavior{
	private String name;
	private int hp;
	public static int attack=30;
	
	public Tank(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void attack(Behavior unit) {
		System.out.println("ÅÊÅ© ¹ß»ç");
		
	}
	@Override
	public int getattack() {
		return attack;
	}
	@Override
	public void setattack(int attack) {
		Tank.attack=attack;
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
