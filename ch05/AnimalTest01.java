package ch05;

abstract class Animal1 {
	abstract String getNAME() ;
}

class Mouse extends Animal1{
	String NAME = "��";
	@Override
	String getNAME() { //�θ� �ż��尡 �߻����̱� ������ �������̵� ���� ������ ������.
		return NAME;
	}
}

class Dog1 extends Animal1 {
	String NAME = "������";

	@Override
	String getNAME() {
		return NAME;
	}
}

class Cat1 extends Animal1 {
	String NAME = "�����";

	@Override
	String getNAME() {
		return NAME;
	}

}

class Bird1 extends Animal1 {

	String NAME = "��";

	@Override
	String getNAME() {
		return NAME;
	}
}

public class AnimalTest01 {

	static void attack1(Animal1 u1, Animal1 u2) {
		System.out.println(u2.getNAME() + "�� " + u1.getNAME() + "���� ���ݴ��߽��ϴ�.");
	}

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		Cat1 c1 = new Cat1();
		Bird1 b1 = new Bird1();

		d1.getNAME();

		System.out.println(d1.NAME + "�� ź��");
		System.out.println(c1.NAME + "�� ź��");
		System.out.println(b1.NAME + "�� ź��");

		// ������vs�����
		attack1(d1, c1);

		// ������vs��
		attack1(d1, b1);

		// �����vs��
		attack1(c1, b1);
	}

}
