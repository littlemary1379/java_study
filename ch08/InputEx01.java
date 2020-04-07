package ch08;

import java.io.IOException;
import java.io.InputStream;

//스트림(byte) -> 물의 흐름
//물이 흐를 때 수도꼭지를 잠궈두면 물이 흐르지 않음.
// 열어두면 물이 흐름. (통신 시작)
//물 = byte
public class InputEx01 {
	public static void main(String[] args) {
		InputStream in = System.in; //키보드에 연결된 바이트 스트림. int 값을 받기 때문에 직접 캐스팅 해줘야함. 
		try {
			int data = in.read();
			System.out.println((char)data); //여러개를 한번에 받을 수 없음. char로 업캐스팅 해야 문자로 받아짐.
		} catch (IOException e) { //e = 오류를 서술한 heap 공간
			System.out.println("IO 오류가 발생");
			//e.getMessage(); // 발생한 오류를 알려줌
			//e.printStackTrace(); // 이 오류를 통해 일어난 추가적인 오류를 추적
			
		}
	}
}
