package array03;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Random r= new Random();
		int k=r.nextInt(100);
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("수를 결정했습니다. 맞추어 보세요.");
		System.out.println("0-99");
		while(true) {
			System.out.print(i+">>");
			int ans=sc.nextInt();
			if(ans>k) {
				System.out.println("더 낮게");
				i++;
				continue;
			}else if(ans<k){
				System.out.println("더 높게");
				i++;
				continue;
			}else{
				System.out.println("정답입니다.");
				System.out.println("다시 하시겠습니까? y/n");
				String a=sc.next();
				if(a.equals("n")) {
					System.out.println("구구단 게임을 종료합니다.");
					break;	
				}else {
					r= new Random();
					k=r.nextInt(100);
					i=1;
					System.out.println("수를 결정했습니다. 맞추어 보세요.");
					System.out.println("0-99");
				}sc.close();
			}
			
		}
	}

}