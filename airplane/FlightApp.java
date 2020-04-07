package airplane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class FlightApp {
	
	public static AirLineList getFlightInfo(String depAirportId, String arrAirportId, Integer depPlandTime){
		try {
			URL url=new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=uaLnSRJvnuUZqahDeBOz%2FK8rf4DSXtNmqWkueOzLButZOzzIfz4mHqWuLXwbVzwPSZ2BE736J6cX1uttigP9RA%3D%3D&numOfRows=50&depAirportId="+depAirportId+"&arrAirportId="+arrAirportId+"&depPlandTime="+depPlandTime+"&airlineId=AAR&_type=json");
			HttpURLConnection con =(HttpURLConnection)url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			StringBuilder sb=new StringBuilder();
			String input="";
			while((input=br.readLine())!=null) {
				System.out.println(input);
				sb.append(input);	
			}
			br.close();
			con.disconnect();
			
			Gson gson=new Gson();
			AirLineList flightInfo=gson.fromJson(sb.toString(), AirLineList.class);
			
			return flightInfo;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String depAirportId="NAARKJJ";
		String arrAirportId="NAARKPC";
		Integer depPlandTime=20200407;
		AirLineList flightInfo=getFlightInfo(depAirportId, arrAirportId, depPlandTime);
		
		//List<Item> myItem = flightInfo.getResponse().getBody().getItems().getItem();
		
		
		// forEach 문 : 첨부터 끝까지 돌릴 때
		for(Item item:flightInfo.getResponse().getBody().getItems().getItem()) {
			System.out.println("항공사 : " +item.getAirlineNm());
			System.out.println("출발지 : " +item.getArrAirportNm());
			System.out.println("도착지 : " +item.getDepAirportNm());
			System.out.println("출발일시 : "+item.getArrPlandTime());
			System.out.println("이코노미 금액 : "+item.getEconomyCharge());
			System.out.println("특등석 금액 : "+item.getPrestigeCharge());
			System.out.println();
			
		}
	
				

	}
}
