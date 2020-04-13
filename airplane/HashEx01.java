package airplane;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth=
				new HashMap<>();
		
		auth.put("아이디","ssarmango");
		auth.put("아이디","코스");
		auth.put("비밀번호","1234");
		System.out.println(auth.get("아이디")); //Hash는 유일한 주소를 가지고 있음. //동일한 값을 쓰면 덮어써짐

	}

}
