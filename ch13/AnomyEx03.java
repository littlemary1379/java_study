package ch13;

class Car{
	 void run() {
		 System.out.println("�ڵ��� �޸���");;
	 }
}

class Sonata extends Car{

}

class Granger extends Car{

}

public class AnomyEx03 {

	static void start(Car C) {
		C.run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new Sonata());
	}

}
