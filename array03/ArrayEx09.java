package array03;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Random r= new Random();
		int k=r.nextInt(100);
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("���� �����߽��ϴ�. ���߾� ������.");
		System.out.println("0-99");
		while(true) {
			System.out.print(i+">>");
			int ans=sc.nextInt();
			if(ans>k) {
				System.out.println("�� ����");
				i++;
				continue;
			}else if(ans<k){
				System.out.println("�� ����");
				i++;
				continue;
			}else{
				System.out.println("�����Դϴ�.");
				System.out.println("�ٽ� �Ͻðڽ��ϱ�? y/n");
				String a=sc.next();
				if(a.equals("n")) {
					System.out.println("������ ������ �����մϴ�.");
					break;	
				}else {
					r= new Random();
					k=r.nextInt(100);
					i=1;
					System.out.println("���� �����߽��ϴ�. ���߾� ������.");
					System.out.println("0-99");
				}sc.close();
			}
			
		}
	}

}