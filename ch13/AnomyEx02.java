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
				System.out.println("멍멍");
			} // 한번 쓰고 버릴거임
		};
		Start(d);
	}
}
