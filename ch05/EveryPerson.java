package ch05;

class ���{
	int num=10;
}

class �ƽþ��� extends ���{
	int num=30;
}

class �ѱ��� extends �ƽþ���{
	
}	

class �ڼ��� extends �ѱ���{
	int num=20;
}

public class EveryPerson {

	public static void main(String[] args) {
		�ڼ��� b1 = new �ڼ���();
		System.out.println(b1.num);
		�ѱ��� b2= new �ڼ���(); //������ ����ȯ
		System.out.println(b2.num); //�޸� ������ �ڼ��ر��� ������� �ѱ��κ��� ��ĵ
		�ڼ��� downB2 = (�ڼ���)b2;  //�ٿ� ĳ����. �� ��, �޸𸮿� ���־�� �Ѵ�.
		System.out.println(downB2.num);
	 	��� b3 = new �ѱ���();
		System.out.println(b3.num);
		//�ڼ��� b4 = new �ѱ���(); <- ����. �޸� ������ �ڼ����� ����.
	}

}
