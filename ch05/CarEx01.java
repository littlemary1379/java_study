package ch05;

class Car{
	void run() {
		System.out.println("�⺻ ������");
	}
}

class Sonata extends Car{
 	void run() {
 		super.run(); //�θ�Ŭ������ heap
 		System.out.println("�ҳ�Ÿ���� ������"); //�ڽ��� ��� ������, �θ��� �ż��带 ��ȿȭ��Ŵ
 	}	//�������̵�� ���� �ÿ� �����ϴ°���(���� ���� �������� ������). <- ���� ���ε�
}
public class CarEx01 {
	public static void main(String[] args) {
		Car s1=new Sonata();
		s1.run();
	}
}
