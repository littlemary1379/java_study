package ch13;

abstract class Ani{
	abstract void sound();
}

class cat extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("�߿�");
	}
}

class bird extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("±��");
	}
}

class Fish extends Ani{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("����");
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
				System.out.println("����");
			} //������Ʈ�� ������ �ʰ�, ��ȸ������ ����Ҷ�.
			//����ü�� ������ ��(����, ����, ±±���� ��� �ٲ�) ���
		});
	}
}
