package array03;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�.");
		boolean confirm=true;
		while (confirm) {
			System.out.println("���� �Է��ϼ���.");
			int num = sc.nextInt();

			// ����ڷκ��� �Է¹��� ������ ���α׷� �ϼ�

			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + i * num);
			}
			System.out.println("��� �����ұ��? y/n");
			String check=sc.next();
			if(check.equals("n")) {
				//break; //���� ����� �ݺ����� �������� �� ���
				confirm=false;
			}
		}
		System.out.println("������ ���α׷� ����");
		sc.close();
	}
}
