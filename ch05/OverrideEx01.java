package ch05;

class A {
	void run() {
		System.out.println("A �޸���.");
	}
}

class B extends A {
	@Override
	void run() {
		System.out.println("B �޸���.");
	}
}

class C extends B {
	String name="C";
	@Override
	void run() {
		System.out.println(name+" �޸���.");
	}

}

public class OverrideEx01 {
	public static void main(String[] args) {

		A a1 = new A();
		a1.run();
		A a2 = new B();
		a2.run(); // �޸𸮿� run�� �߸� �������̵��� ��
		A a3 = new C();
		a3.run();
		//System.out.println(a3.name); ���� ��ü�δ� ������ �Ұ��ϰ�, �Լ��θ� ������ ������
		//B b1=new A(); ����Ű�� ���� �޸𸮿� ���� ����
		B b2=new B();
		b2.run();
		B b3=new C();
		b3.run();
		
	}
}
