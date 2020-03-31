package stars;

import stars.protoss.Dragoon;
import stars.protoss.Protoss;
import stars.protoss.Zealot;
import stars.terran.Marine;
import stars.terran.Tank;
import stars.zerg.Hydra;
import stars.zerg.Ultra;

public class StartGame {
	public static void move(Behavior b) {
		b.move();
	}
	public static void repair(Behavior b) {
		b.repair();
	}
	public static void attack(Behavior b1,Behavior b2) {
		int hp=b2.gethp()-b1.getattack();
		b2.sethp(hp);
		System.out.println(b2.getName()+"�� "+b1.getName()+"���� ���ݹް� �ֽ��ϴ�.");
		System.out.println(b2.getName()+"�� ���� ü����"+b2.gethp()+"�Դϴ�.");
	}
	
	public static void attack(Behavior b1,Protoss b2) {
		int sh=b2.getsh()-b1.getattack();
		if(sh>=0) {
			b2.setsh(sh);
			System.out.println(b2.getName()+"�� "+b1.getName()+"���� ���ݹް� �ֽ��ϴ�.");
			System.out.println(b2.getName()+"�� ���� �ǵ��"+b2.getsh()+"�Դϴ�.");
		}else{
			int hp=b2.gethp()+sh;
			b2.sethp(hp);
			b2.setsh(sh);
			System.out.println(b2.getName()+"�� "+b1.getName()+"���� ���ݹް� �ֽ��ϴ�.");
			System.out.println(b2.getName()+"�� ���� ü����"+b2.gethp()+"�Դϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		Protoss.upgrade();
		Zealot z1=new Zealot("����1");
		Dragoon d1=new Dragoon("���1");
		Marine m1=new Marine("����1");
		Tank t1=new Tank("��ũ1");
		Hydra h1=new Hydra("�����1");
		Ultra u1=new Ultra("��Ʈ��1");
		
		move(z1);
		repair(h1);
		attack(t1,u1);
		attack(h1,m1);
		attack(u1,d1);
		attack(u1,d1);
		attack(u1,d1);
		
	}

}
