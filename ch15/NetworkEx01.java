package ch15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkEx01 {

	public static void main(String[] args) {
		//1�� �ּ� ��ü �����
		try {
			URL url=new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=uaLnSRJvnuUZqahDeBOz%2FK8rf4DSXtNmqWkueOzLButZOzzIfz4mHqWuLXwbVzwPSZ2BE736J6cX1uttigP9RA%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			//2�� ��Ʈ�� ����
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			//3�� ���ۿ���
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));

			//4. ���� ���ϱ�
			StringBuilder sb= new StringBuilder(); // = ArrayList<String>
			String input="";
			while((input=br.readLine())!=null){
				sb.append(input);
			}
			System.out.println(sb.toString());
		} catch (Exception e) { //���� �ʴ� �ּ��� ���,
			e.printStackTrace();
		}
		
	}
}
