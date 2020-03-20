package ch01;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int year = sc.nextInt();
		
		if(score>=60 && score<=100) { //60점 이상
			if(year!=4)
				System.out.println("합격!");
			else if(score>=70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}else if(score>=0 && score<60)
			System.out.println("불합격!");
		else
			System.out.println("입력을 다시 해주세요.");
		
		sc.close();
	}

}
