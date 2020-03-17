package ch02;

class person{
	String name="강근영";
	int age=26;
	char gender='여';
	String email="qldhffk112@naver.com";
	String phone="010-8789-5675";
}


public class VarEx06 {
	public static void main(String[] args) {
		person a=new person();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
	}

}
