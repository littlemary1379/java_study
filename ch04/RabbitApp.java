package ch04;

class Rabbit {
	private String name; //heap����, ��������, �ɹ�����, �ʵ�, �Ӽ�, ������Ƽ
	private int power;

	public Rabbit(String name, int power) {
		this.name = name;
		this.power = power;
	}
	//����(å��)
	boolean drink() {
		//100�� �Ѿ�� �������� �ʵ���
			if(power==100) {
				return false;
			}
			power++;
			return true;
	}
	public int getpower() {
		return power;
	}
	
	void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class RabbitApp {
	public static void main(String[] args) {
		Rabbit r1=new Rabbit("�䳢", 20); //100�� �ƽ�
		while(r1.drink()) {}
		System.out.println(r1.getpower());
/*		while(true) {
			r1.drink();
			System.out.println(r1.getpower());
			if(r1.getpower()>=100) {
				break;
			}
		}
*/		
		//�̸� ����
		r1.setName("���䳢");
		System.out.println(r1.getName());
		
	}
}
