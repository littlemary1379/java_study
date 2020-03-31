package ch05;


//추상클래스는 일반 매서드를 가질 수 있다
//추상매서드는 내가 구현할 수 없는 매서드를 오브젝트에게 미룰 수 있다.
abstract class Food{
	abstract void standby(); //모르기 때문에
	
	void eat() {
		System.out.println("음식을 먹습니다.");
	}
	protected abstract void cook(); //오버라이드 해야해서 은닉할 수 없음.
	//protected : 자식만 사용 가능
	
	void auto() {
		standby();
		cook();
		eat();
	} //함수의 순서를 자동으로 만드는 함수
}
	
class 라면 extends Food{

	@Override
	protected
	void cook() {
		System.out.println("냄비에 끓인다.");
		
		
	}

	@Override
	void standby() {
		System.out.println("냄비와 라면과 가스를 준비한다.");
		
	}
	
	
}
class 삼겹살 extends Food{
	
	@Override
	protected
	void cook() {
		System.out.println("불판에 굽는다.");
		
	}

	@Override
	void standby() {
		System.out.println("고기와 불판, 버너를 준비한다.");
		
	}
	
}
public class FoodEx02 {
	static void start(Food f) {
		f.auto();
	}
	
	public static void main(String[] args) {
		start(new 라면());

	}

}
