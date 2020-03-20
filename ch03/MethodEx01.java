package ch03;

//메서드는 클래스 안에 작성할 수 있다.
//메서드(함수)는 메서드(함수) 안에 작성할 수 없다.
public class MethodEx01 {
	
	
	public static void main(String[] args) {
		
		int num=Cal.add(5,3);
		System.out.println("결과 : "+num);
		
		int num2=Cal.minus(8, 5);
		System.out.println("결과2 : "+num2);
		
		int num3=Cal.multi(7,3);
		System.out.println("결과3 : "+num3);
		
		int num4=Cal.divide(4, 2);
		System.out.println("결과4 : "+num4);
	}
	
}
