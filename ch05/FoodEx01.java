package ch05;


//�߻�Ŭ������ ������Ʈ�� �ƴ϶� new �� �� ����.
//�߻�Ŭ������ �߻� �ż��带 ���� �� �ִ�.

abstract class Food1 {
	abstract void eat(); //�߻�ż���
}

class ���1 extends Food1{
	String name="���1";
	
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
	}
}

class �Ұ��1 extends Food1{
	String name="�Ұ��1";
	
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
	}
	
}

class ���� extends Food1 {
	String name="����";
	
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
	}
	
}

public class FoodEx01 {
	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new ���1());
	}
}
