package ch13;

interface Dog{
	void sound();
}



public class AnomyEx02 {
	
	static void Start(Dog d) {
		d.sound();
	}
	public static void main(String[] args) {
		Dog d=new Dog() {
			
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("�۸�");
			} // �ѹ� ���� ��������
		};
		Start(d);
	}
}
