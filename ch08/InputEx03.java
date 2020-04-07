package ch08;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;

public class InputEx03 {
	public static void main(String[] args) {
		//InputStream in = System.in;
		//InputStreamReader reader = new InputStreamReader(in);

		//BufferedReader br = new BufferedReader(reader); // 반대 : bufferedwrite

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		// 반대 : outputstreamreader
		String data = "";
		try {
			while ((data=br2.readLine())!=null) {
				System.out.println(data);
				} // input 받은 데이터를 읽는데 이용하는 메서드
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 오류 시 초기화가 일어나지 않을 수 있기 때문에 초기화 해야함.

	}
}
