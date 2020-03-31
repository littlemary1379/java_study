package ch05;

abstract class 칼{
	abstract void kill();
	abstract void cook();
	abstract void repair();
}

//추상클래스는 어댑터의 용도로 사용 가능하다.
abstract class 요리사어댑터 extends 칼{
	@Override
	void kill() {
			
		
	}
	@Override
	void repair() {
		
		
	} //어댑터가 2개를 미리 구현
}


class 백종원 extends 요리사어댑터{

	@Override
	void cook() {
		
		
	} //실제 메서드는 하나만 구현하면 됨

}


public class FoodEx03 {

	public static void main(String[] args) {
		

	}

}
