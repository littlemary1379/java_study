package ch05;

class Animal{
	
}
class Dog extends Animal{
	final String NAME="������"; 
}
class Cat extends Animal{
	final String NAME="�����";
}

class Bird extends Animal{
	final String NAME="��";
}
public class AnimalEx01 {

	static void attack(Dog u1, Cat u2) {
		System.out.println(u2.NAME+"�� "+u1.NAME+"���� ���ݴ��߽��ϴ�.");
	}
	static void attack(Dog u1, Bird u2) {
		System.out.println(u2.NAME+"�� "+u1.NAME+"���� ���ݴ��߽��ϴ�.");
	}
	static void attack(Cat u1, Bird u2) {
		System.out.println(u2.NAME+"�� "+u1.NAME+"���� ���ݴ��߽��ϴ�.");
	}


	
	
	public static void main(String[] args) {
		Dog d1=new Dog();
		Cat c1=new Cat();
		Bird b1=new Bird();
		
		System.out.println(d1.NAME+ "�� ź��");
		System.out.println(c1.NAME+ "�� ź��");
		System.out.println(b1.NAME+ "�� ź��");
		
		//������vs�����
		attack(d1,c1);
		
		//������vs��
		attack(d1,b1);
		
		//�����vs��
		attack(c1,b1);
	}

}
