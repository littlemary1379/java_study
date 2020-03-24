package array03;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx09Another {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Random r = new Random();
			int k = r.nextInt(100);
			int i = 1;
			int max=99;
			int min=0;
			System.out.println("수를 결정했습니다. 맞추어 보세요.");
			System.out.println("0-99");
			while (true) {
				int ans=0;
				System.out.print(i + ">>");
				try {
					ans = sc.nextInt();
				} catch (Exception e) {
					System.out.println("정수를 입력해주세요!");
					sc.nextLine();
					continue;
				}
				if (ans > k) {
					max=ans;
					System.out.println("더 낮게");
					System.out.println(min+"-"+max);
				} else if (ans < k) {
					min=ans;
					System.out.println("더 높게");
					System.out.println(min+"-"+max);
				} else {
					System.out.println("정답입니다.");
					break;
				}
				i++;
				continue;
			}
			System.out.println("다시 하시겠습니까? y/n");
			String a = sc.next();
			if (a.equals("n")) {
				break;
			}
		}
		System.out.println("숫자 맞추기 게임을 종료합니다.");
		sc.close();
	}
}