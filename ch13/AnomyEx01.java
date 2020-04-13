package ch13;

//규약
interface Animal{
	void move(); //추상 매서드 : 추상적이기 때문에 오브젝트가 될 수 없음
}

abstract class Person{
	abstract void eat();
}

public class AnomyEx01 {

	public static void main(String[] args) {
		//Animal a= new Animal(); //추상 메서드가 구현되지 않아서 new 불가
		//Person p=new Person(); //추상 매서드가 구현되지 않아서 new 불가
		//Person p2=new Person(); //추상 클래스는 추상 매서드가 들어올 수 있기 때문에 new 불가
		
	}

}
