package coffeeshop.test;

//Generic 클래스 생성시 타입 결정
//E -element, K- Key, V - value, T- Type,N-Number

class Data<T>{
	T value;
}

class Str<K,V>{
	K k;
	V v;
}

public class GenericEx01 {
	public static void main(String[] args) {
		Data<String>data=new Data<>();
		data.value="문자열";
		System.out.println(data.value);
		//레퍼런스 자료형만 들어갈 수 있음
		//레퍼(Wrapper) 클래스를 자바에서 제공함
		Data<Integer>data2=new Data<>();
		data2.value=10;
		System.out.println(data2.value);
		
		Str<String,String>s=new Str<>();
		s.k="비밀번호";
		s.v="bitc5600";
		
		System.out.println(s.k);
		System.out.println(s.v);
		
	}
}
