package ch05;

abstract class Į{
	abstract void kill();
	abstract void cook();
	abstract void repair();
}

//�߻�Ŭ������ ������� �뵵�� ��� �����ϴ�.
abstract class �丮������ extends Į{
	@Override
	void kill() {
			
		
	}
	@Override
	void repair() {
		
		
	} //����Ͱ� 2���� �̸� ����
}


class ������ extends �丮������{

	@Override
	void cook() {
		
		
	} //���� �޼���� �ϳ��� �����ϸ� ��

}


public class FoodEx03 {

	public static void main(String[] args) {
		

	}

}
