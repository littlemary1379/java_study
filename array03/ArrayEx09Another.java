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
			System.out.println("���� �����߽��ϴ�. ���߾� ������.");
			System.out.println("0-99");
			while (true) {
				int ans=0;
				System.out.print(i + ">>");
				try {
					ans = sc.nextInt();
				} catch (Exception e) {
					System.out.println("������ �Է����ּ���!");
					sc.nextLine();
					continue;
				}
				if (ans > k) {
					max=ans;
					System.out.println("�� ����");
					System.out.println(min+"-"+max);
				} else if (ans < k) {
					min=ans;
					System.out.println("�� ����");
					System.out.println(min+"-"+max);
				} else {
					System.out.println("�����Դϴ�.");
					break;
				}
				i++;
				continue;
			}
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? y/n");
			String a = sc.next();
			if (a.equals("n")) {
				break;
			}
		}
		System.out.println("���� ���߱� ������ �����մϴ�.");
		sc.close();
	}
}