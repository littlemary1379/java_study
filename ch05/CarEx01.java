package ch05;

class Car{
	void run() {
		System.out.println("기본 움직임");
	}
}

class Sonata extends Car{
 	void run() {
 		super.run(); //부모클래스의 heap
 		System.out.println("소나타만의 움직임"); //자식이 들고 있으면, 부모의 매서드를 무효화시킴
 	}	//오버라이드는 실행 시에 무시하는거임(실행 이후 동적으로 움직임). <- 동적 바인딩
}
public class CarEx01 {
	public static void main(String[] args) {
		Car s1=new Sonata();
		s1.run();
	}
}
