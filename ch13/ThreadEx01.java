package ch13;


//os�� runnable Ÿ���� heap ������ run �޼��带 ȣ���ؾ��Ѵٴ� ���� �˰� ��
class Sub implements Runnable{ //os�� ã��, �������̽� �� ���
	
	
	@Override
	public void run() { 
		//�̸��� ����������. �ý������� �̿��� os�� ��� �ִ� ��� ���.
		for (int i = 1; i < 11; i++) {
			System.out.println("���� ������ : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {
	
	//���� ������
	public static void main(String[] args) {
		Thread t1=new Thread(new Sub());
		t1.start();
		for (int i = 1; i < 6; i++) {
			System.out.println("���� ������ : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
