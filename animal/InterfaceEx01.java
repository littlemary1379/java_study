package animal;

interface Cal{
	int num=10; //변수 : public static final 생략
	//함수 : public abstract 생략
	//인터페이스는 통로 역할 - 동적 바인딩용
	//무조건 추상 메서드만 존재 가능 = 강제성 부여
	//new 할 수 없다.
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		System.out.println(Cal.num);
	}
}
