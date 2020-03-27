package stars;

class Zealot {
	final String NAME; // 데이터가 지정된 이후 read only 데이터로 바뀜. 대문자로 쓸것
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

	// 질럿 => 드라군
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}

	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(Zealot u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}

	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}

	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	static void attack(River u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "가 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다.");
	}
	
	
	public static void main(String[] args) {
		// 업그레이드하기
		Zealot.attack++;
		// 질럿 생성하기
		Zealot z1 = new Zealot("1번 질럿");
		System.out.println(Zealot.attack);
		Zealot z2 = new Zealot("2번 질럿");
		System.out.println(Zealot.attack);
		Dragoon d1 = new Dragoon("1번 드라군");
		Dragoon d2 = new Dragoon("2번 드라군");
		DarkTempler t1 = new DarkTempler("1번 다크템플러");
		DarkTempler t2 = new DarkTempler("2번 다크템플러");
		River r1 = new River("1번 리버");
		River r2 = new River("2번 리버");


		// 공격하기
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
