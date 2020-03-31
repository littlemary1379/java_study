package ch05;

class A {
	void run() {
		System.out.println("A 달린다.");
	}
}

class B extends A {
	@Override
	void run() {
		System.out.println("B 달린다.");
	}
}

class C extends B {
	String name="C";
	@Override
	void run() {
		System.out.println(name+" 달린다.");
	}

}

public class OverrideEx01 {
	public static void main(String[] args) {

		A a1 = new A();
		a1.run();
		A a2 = new B();
		a2.run(); // 메모리에 run이 뜨면 오버라이딩이 됨
		A a3 = new C();
		a3.run();
		//System.out.println(a3.name); 변수 자체로는 접근이 불가하고, 함수로만 접근이 가능함
		//B b1=new A(); 가리키는 것이 메모리에 뜨지 않음
		B b2=new B();
		b2.run();
		B b3=new C();
		b3.run();
		
	}
}
