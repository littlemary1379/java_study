package ch03;

class Data{
	int num=10;
}

public class MethodEx02 {
	
	static int ����(int num) {
		num++;
		System.out.println("���� num : "+num);
		return num;
	}
	
	static void ����(Data d) {
		d.num--;
		System.out.println("���� num : "+d.num);
	}
	
	public static void main(String[] args) {
		int myNum=100; //call by value passing(�޼��尡 ������ �� ����)
		myNum=����(myNum);
		System.out.println("myNum : "+myNum);
		
		//call by reference passing(�޼��尡 ������ heap ���� ���� ���ϱ� ������ ����X)
		Data data=new Data();
		MethodEx02.����(data);
		System.out.println("data.num : "+data.num);
		
	}
}
