package ch05;

class 사람{
	int num=10;
}

class 아시아인 extends 사람{
	int num=30;
}

class 한국인 extends 아시아인{
	
}	

class 박서준 extends 한국인{
	int num=20;
}

public class EveryPerson {

	public static void main(String[] args) {
		박서준 b1 = new 박서준();
		System.out.println(b1.num);
		한국인 b2= new 박서준(); //묵시적 형변환
		System.out.println(b2.num); //메모리 공간은 박서준까지 띄우지만 한국인부터 스캔
		박서준 downB2 = (박서준)b2;  //다운 캐스팅. 이 때, 메모리에 떠있어야 한다.
		System.out.println(downB2.num);
	 	사람 b3 = new 한국인();
		System.out.println(b3.num);
		//박서준 b4 = new 한국인(); <- 오류. 메모리 공간에 박서준이 없음.
	}

}
