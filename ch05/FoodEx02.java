package ch05;


//�߻�Ŭ������ �Ϲ� �ż��带 ���� �� �ִ�
//�߻�ż���� ���� ������ �� ���� �ż��带 ������Ʈ���� �̷� �� �ִ�.
abstract class Food{
	abstract void standby(); //�𸣱� ������
	
	void eat() {
		System.out.println("������ �Խ��ϴ�.");
	}
	protected abstract void cook(); //�������̵� �ؾ��ؼ� ������ �� ����.
	//protected : �ڽĸ� ��� ����
	
	void auto() {
		standby();
		cook();
		eat();
	} //�Լ��� ������ �ڵ����� ����� �Լ�
}
	
class ��� extends Food{

	@Override
	protected
	void cook() {
		System.out.println("���� ���δ�.");
		
		
	}

	@Override
	void standby() {
		System.out.println("����� ���� ������ �غ��Ѵ�.");
		
	}
	
	
}
class ���� extends Food{
	
	@Override
	protected
	void cook() {
		System.out.println("���ǿ� ���´�.");
		
	}

	@Override
	void standby() {
		System.out.println("���� ����, ���ʸ� �غ��Ѵ�.");
		
	}
	
}
public class FoodEx02 {
	static void start(Food f) {
		f.auto();
	}
	
	public static void main(String[] args) {
		start(new ���());

	}

}
