package ch15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkEx01 {

	public static void main(String[] args) {
		//1번 주소 객체 만들기
		try {
			URL url=new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=uaLnSRJvnuUZqahDeBOz%2FK8rf4DSXtNmqWkueOzLButZOzzIfz4mHqWuLXwbVzwPSZ2BE736J6cX1uttigP9RA%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			//2번 스트림 연결
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			//3번 버퍼연결
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));

			//4. 문자 더하기
			StringBuilder sb= new StringBuilder(); // = ArrayList<String>
			String input="";
			while((input=br.readLine())!=null){
				sb.append(input);
			}
			System.out.println(sb.toString());
		} catch (Exception e) { //맞지 않는 주소일 경우,
			e.printStackTrace();
		}
		
	}
}
