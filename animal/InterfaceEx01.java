package animal;

interface Cal{
	int num=10; //���� : public static final ����
	//�Լ� : public abstract ����
	//�������̽��� ��� ���� - ���� ���ε���
	//������ �߻� �޼��常 ���� ���� = ������ �ο�
	//new �� �� ����.
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		System.out.println(Cal.num);
	}
}
