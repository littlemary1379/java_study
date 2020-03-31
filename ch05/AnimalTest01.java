package ch05;

abstract class Animal1 {
	abstract String getNAME() ;
}

class Mouse extends Animal1{
	String NAME = "쥐";
	@Override
	String getNAME() { //부모 매서드가 추상적이기 때문에 오버라이딩 하지 않으면 오류남.
		return NAME;
	}
}

class Dog1 extends Animal1 {
	String NAME = "강아지";

	@Override
	String getNAME() {
		return NAME;
	}
}

class Cat1 extends Animal1 {
	String NAME = "고양이";

	@Override
	String getNAME() {
		return NAME;
	}

}

class Bird1 extends Animal1 {

	String NAME = "새";

	@Override
	String getNAME() {
		return NAME;
	}
}

public class AnimalTest01 {

	static void attack1(Animal1 u1, Animal1 u2) {
		System.out.println(u2.getNAME() + "가 " + u1.getNAME() + "에게 공격당했습니다.");
	}

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		Cat1 c1 = new Cat1();
		Bird1 b1 = new Bird1();

		d1.getNAME();

		System.out.println(d1.NAME + "의 탄생");
		System.out.println(c1.NAME + "의 탄생");
		System.out.println(b1.NAME + "의 탄생");

		// 강아지vs고양이
		attack1(d1, c1);

		// 강아지vs새
		attack1(d1, b1);

		// 고양이vs새
		attack1(c1, b1);
	}

}
