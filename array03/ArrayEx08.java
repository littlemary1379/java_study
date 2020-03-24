package array03;

import java.util.Scanner;

public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("대문자를 입력하세요. : ");
		String eng=sc.next();
		System.out.println();
		int e=eng.charAt(0);
		for (int i = e; i < 90; i++) {
			System.out.print((char)(i+1)+" ");
			
		}sc.close();
	}
}
