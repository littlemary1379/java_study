package ch03;

class Data{
	int num=10;
}

public class MethodEx02 {
	
	static int 증가(int num) {
		num++;
		System.out.println("증가 num : "+num);
		return num;
	}
	
	static void 감소(Data d) {
		d.num--;
		System.out.println("감소 num : "+d.num);
	}
	
	public static void main(String[] args) {
		int myNum=100; //call by value passing(메서드가 끝나면 값 삭제)
		myNum=증가(myNum);
		System.out.println("myNum : "+myNum);
		
		//call by reference passing(메서드가 끝나고 heap 내부 값이 변하기 때문에 삭제X)
		Data data=new Data();
		MethodEx02.감소(data);
		System.out.println("data.num : "+data.num);
		
	}
}
