package ch13;

abstract class Ani{
	abstract void sound();
}

class cat extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
}

class bird extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹잭");
	}
}

class Fish extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("뻐끔");
	}
}

public class AnomyEx04 {
	static void start(Ani a) {
		a.sound();
	}
	public static void main(String[] args) {
		start(new cat());
		start(new Fish());
		start(new Ani() {
			
			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("음메");
			} //오브젝트를 만들지 않고, 일회성으로 사용할때.
			//구현체가 동적일 때(음메, 뻐끔, 짹짹으로 계속 바뀜) 사용
		});
	}
}
