package ch02;

public class VarEx03 {

	public static void main(String[] args) {
		char s1 ='가';
		System.out.println(s1);
		
		s1='나';
		System.out.println(s1);
		
		char c1='가';
		char c2='나';
		char c3='다';

		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char[] str= {'가','나','다'};
		System.out.print(str[0]);
		System.out.print(str[1]);
		System.out.print(str[2]);
		System.out.println();
		
		//System.out.print(str[3]); //배열의 범위가 벗어나서 예외 발생
		str[0]='라';
		System.out.println(str[0]);
	}

}
