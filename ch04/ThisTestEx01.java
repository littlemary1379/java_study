package ch04;

class AirPlane{
	String name;
	String color;
	
	public AirPlane(String name, String color) {
		this.name = name;
		this.color = color;
	}
}


public class ThisTestEx01 {

	public static void main(String[] args) {
		AirPlane a1=new AirPlane("��Ʈ��", "���");	
		AirPlane a2=new AirPlane("�װ���", "���");	
		System.out.println(a1);
		System.out.println(a2);

	}

}
