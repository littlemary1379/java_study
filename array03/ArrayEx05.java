package array03;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // ������ ����ȯ
		String tempNum2[] = tempNum.split("");
		System.out.println("���� : " + tempNum2.length);

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
			//ù°�ڸ� �տ� , �� ������ �ȵǴ� ù ��������.
			if(i==0)tempNum2[i]=""+tempNum2[i];
			//i�� 3���� ���� ���� p���� ������ �տ� , �� ����
			else if(i%3==p)tempNum2[i]=","+tempNum2[i];
			//�ڸ������ ���
			System.out.print(tempNum2[i]);
		} sc.close();
		
	} 
}
