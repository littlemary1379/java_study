package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//캐스팅 없이 문자로 읽기
//한 개 이상을 받기(중간과정임...)

public class InputEx02 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		char[] data=new char[3]; //call by reference : return이 필요없음.
		try {
			reader.read(data);
			System.out.println(data); //메모리낭비가 생기고, 긴 데이터는 받을 수 없음.(가변적이지 않음)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
