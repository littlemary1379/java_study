package stars;

class Zealot {
	final String NAME; // �����Ͱ� ������ ���� read only �����ͷ� �ٲ�. �빮�ڷ� ����
	int hp;
	static int attack = 10;

	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

class Dragoon {
	final String NAME;
	int hp;
	static int attack = 15;

	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

class DarkTempler {
	final String NAME;
	int hp;
	static int attack = 50;

	public DarkTempler(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

class River {
	final String NAME;
	int hp;
	static int attack = 50;

	public River(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

public class GameStart {

	// ���� => ���
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}

	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Zealot u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}

	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}

	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�.");
	}
	
	
	public static void main(String[] args) {
		// ���׷��̵��ϱ�
		Zealot.attack++;
		// ���� �����ϱ�
		Zealot z1 = new Zealot("1�� ����");
		System.out.println(Zealot.attack);
		Zealot z2 = new Zealot("2�� ����");
		System.out.println(Zealot.attack);
		Dragoon d1 = new Dragoon("1�� ���");
		Dragoon d2 = new Dragoon("2�� ���");
		DarkTempler t1 = new DarkTempler("1�� ��ũ���÷�");
		DarkTempler t2 = new DarkTempler("2�� ��ũ���÷�");
		River r1 = new River("1�� ����");
		River r2 = new River("2�� ����");


		// �����ϱ�
		attack(z1, z2);
		attack(z1, d1);
		attack(z1, t1);
		attack(z1, r1);
		attack(d1, z1);
		attack(d1, d2);
		attack(d1, t1);
		attack(d1, r1);
		attack(t1, z1);
		attack(t1, d1);
		attack(t1, t2);
		attack(t1, r1);
		attack(r1, z1);
		attack(r1, d1);
		attack(r1, t1);
		attack(r1, r2);

	}

}
