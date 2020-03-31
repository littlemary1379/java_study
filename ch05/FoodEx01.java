package ch05;


//추상클래스는 오브젝트가 아니라 new 할 수 없음.
//추상클래스는 추상 매서드를 가질 수 있다.

abstract class Food1 {
	abstract void eat(); //추상매서드
}

class 라면1 extends Food1{
	String name="라면1";
	
	@Override
	void eat() {
		System.out.println(name+"을 먹었습니다.");
		
	}
}

class 불고기1 extends Food1{
	String name="불고기1";
	
	@Override
	void eat() {
		System.out.println(name+"를 먹었습니다.");
		
	}
	
}

class 갈비 extends Food1 {
	String name="갈비";
	
	@Override
	void eat() {
		System.out.println(name+"를 먹었습니다.");
		
	}
	
}

public class FoodEx01 {
	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new 라면1());
	}
}
