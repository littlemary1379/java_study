package animal;

interface Animal{
	void run();
	void sound();
	
}

class Dog implements Animal{

	@Override
	public void run() {
		System.out.println("°­¾ÆÁö°¡ ´Þ¸°´Ù");
		
	}

	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
		
	}
	
	
}
class Bird implements Animal{

	@Override
	public void run() {
		System.out.println("»õµµ °È´Â´Ù.");
		
	}

	@Override
	public void sound() {
		System.out.println("Â±Â±");
		
		
	}
	public void fly() {
		System.out.println("»õ´Â ³­´Ù.");
	}


}

public class AnimalEx02 {
	
	static void start(Animal a) {
		a.run();
		a.sound();
		if(a instanceof Bird) {
			((Bird)a).fly();
		}
	}
	
	public static void main(String[] args) {
		start(new Dog());
		start(new Bird());
		
	}
}
