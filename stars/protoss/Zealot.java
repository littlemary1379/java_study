package stars.protoss;

import stars.Behavior;

public class Zealot extends Protoss implements Behavior{
	private String name;
	private int hp;
	private int sh;
	public static int attack=10;
	public Zealot(String name) {
		this.name = name;
		this.hp = 100;
		this.sh = 100;
	}
	
	@Override
	public void attack(Behavior unit) {
		System.out.println("근거리 공격");
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public int getsh() {
		return sh;
	}
	
	public void setsh(int sh) {
		this.sh=sh;
	}
	@Override
	public int getattack() {
		return attack;
	}
	@Override
	public void setattack(int attack) {
		Zealot.attack=attack;
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
