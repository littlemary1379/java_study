package ch04;

//���¿� �ൿ

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//����Ʈ ������(�Ű� ������ ���� ��)=�ʱ�ȭ <- �����Ϸ��� �������
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//�����ε� : �Լ� �̸��� ���Ƶ� �Ű������� �ٸ��� �߰����� ��
	
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	


	
}
