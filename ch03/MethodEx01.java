package ch03;

//�޼���� Ŭ���� �ȿ� �ۼ��� �� �ִ�.
//�޼���(�Լ�)�� �޼���(�Լ�) �ȿ� �ۼ��� �� ����.
public class MethodEx01 {
	
	
	public static void main(String[] args) {
		
		int num=Cal.add(5,3);
		System.out.println("��� : "+num);
		
		int num2=Cal.minus(8, 5);
		System.out.println("���2 : "+num2);
		
		int num3=Cal.multi(7,3);
		System.out.println("���3 : "+num3);
		
		int num4=Cal.divide(4, 2);
		System.out.println("���4 : "+num4);
	}
	
}
