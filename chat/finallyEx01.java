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
	
	//상태체크,(hp,sh)
	static void check(StarUnit unit) {
		try {
			Zealot z=(Zealot)unit;
			System.out.println("남은 실드는 "+z.getSh());			
			System.out.println("남은 체력은 "+z.getHp());			
		} catch (Exception e) {
			Ultra u=(Ultra)unit;
			System.out.println("저그는 실드가 없습니다.");
			System.out.println("남은 체력은 "+u.getHp());
		}finally { //무조건 실행
			System.out.println("무조건 실행됨;");
		}

	}

	public static void main(String[] args) {
		check(new Zealot());
		
	}
}
