package coffeeshop.test;

//Generic Ŭ���� ������ Ÿ�� ����
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
		data.value="���ڿ�";
		System.out.println(data.value);
		//���۷��� �ڷ����� �� �� ����
		//����(Wrapper) Ŭ������ �ڹٿ��� ������
		Data<Integer>data2=new Data<>();
		data2.value=10;
		System.out.println(data2.value);
		
		Str<String,String>s=new Str<>();
		s.k="��й�ȣ";
		s.v="bitc5600";
		
		System.out.println(s.k);
		System.out.println(s.v);
		
	}
}
