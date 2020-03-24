package array03;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // 묵시적 형변환
		String tempNum2[] = tempNum.split("");
		System.out.println("길이 : " + tempNum2.length);

		int len=tempNum2.length;//len=4
		for(int i=0; i<len; i++) {
			if((len-i)%3==0 && i!=0) {
				System.out.print(",");
			}
			System.out.print(tempNum2[i]);
		}
		System.out.println();
		
		int p=(tempNum2.length%3);
		for (int i = 0; i < tempNum2.length; i++) {
			//첫째자리 앞에 , 이 붙으면 안되니 첫 조건으로.
			if(i==0)tempNum2[i]=""+tempNum2[i];
			//i를 3으로 나눈 것이 p값과 같으면 앞에 , 를 붙임
			else if(i%3==p)tempNum2[i]=","+tempNum2[i];
			//자릿수대로 출력
			System.out.print(tempNum2[i]);
		} sc.close();
		
	} 
}
