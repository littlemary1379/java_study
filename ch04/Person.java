package ch04;

//상태와 행동

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//디폴트 생성자(매개 변수가 없는 것)=초기화 <- 컴파일러가 만들어줌
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//오버로딩 : 함수 이름이 같아도 매개변수가 다르면 추가적재 됨
	
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	


	
}
