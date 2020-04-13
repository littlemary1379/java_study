package ch13;

interface Callback{
	void printMoney(int money);
}

class MoneyChange{
	int money=10000;
	
	public int accept(Callback callback) {
		//���࿡ ���� ��û�� �ؼ� 20000���� ��������(2�� �ɸ�)
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money=money+20000;
					callback.printMoney(money);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}).start();
		return money;
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {
		MoneyChange mc=new MoneyChange();
		int myMoney=500;
		mc.accept(new Callback() {
			@Override
			public void printMoney(int money) {
				money=money+myMoney;
				System.out.println("�ݾ��� : "+money);
				// TODO Auto-generated method stub	
			}
				
		});
		
		for (int i = 1; i < 6; i++) {
			System.out.println("���� ������ : "+i);			
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
		
	}
}
