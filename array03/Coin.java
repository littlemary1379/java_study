package array03;

//���� ������ ������ ���ϴ� ���α׷�

public class Coin {

	public static void main(String[] args) {
		int money=1250;
		int count=0;
		int coin[]= {500,100,50,10};
		System.out.println("���� �ݾ� : "+money);
		
		for (int i = 0; i < coin.length; i++) {
			count=money/coin[i];
			money=money%coin[i];
			System.out.println(coin[i]+"�� ���� : "+count);
			System.out.println("���� �ݾ� : "+money);
		}
		
	}

}
