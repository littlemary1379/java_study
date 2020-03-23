package array03;

//남은 동전의 갯수를 구하는 프로그램

public class Coin {

	public static void main(String[] args) {
		int money=1250;
		int count=0;
		int coin[]= {500,100,50,10};
		System.out.println("시작 금액 : "+money);
		
		for (int i = 0; i < coin.length; i++) {
			count=money/coin[i];
			money=money%coin[i];
			System.out.println(coin[i]+"원 갯수 : "+count);
			System.out.println("남은 금액 : "+money);
		}
		
	}

}
