package chat;

interface StarUnit{
	abstract int getHp();

}

abstract class Protoss implements StarUnit{
	abstract int getSh();
}

abstract class Zerg implements StarUnit{}

class Zealot extends Protoss{
	int sh=100;
	int hp=100;
	@Override
	public int getSh() {
		// TODO Auto-generated method stub
		return sh;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
}

class Ultra extends Zerg{
	int hp=100;
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
}

public class finallyEx01 {
	
	//����üũ,(hp,sh)
	static void check(StarUnit unit) {
		try {
			Zealot z=(Zealot)unit;
			System.out.println("���� �ǵ�� "+z.getSh());			
			System.out.println("���� ü���� "+z.getHp());			
		} catch (Exception e) {
			Ultra u=(Ultra)unit;
			System.out.println("���״� �ǵ尡 �����ϴ�.");
			System.out.println("���� ü���� "+u.getHp());
		}finally { //������ ����
			System.out.println("������ �����;");
		}

	}

	public static void main(String[] args) {
		check(new Zealot());
		
	}
}
