package ch02;

public class VarEx03 {

	public static void main(String[] args) {
		char s1 ='��';
		System.out.println(s1);
		
		s1='��';
		System.out.println(s1);
		
		char c1='��';
		char c2='��';
		char c3='��';

		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char[] str= {'��','��','��'};
		System.out.print(str[0]);
		System.out.print(str[1]);
		System.out.print(str[2]);
		System.out.println();
		
		//System.out.print(str[3]); //�迭�� ������ ����� ���� �߻�
		str[0]='��';
		System.out.println(str[0]);
	}

}
