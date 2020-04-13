package airplane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class FlightApp {
	
	public static int getTotalCount(String depAirportId, String arrAirportId, Long depPlandTime) {
		try {
			URL url=new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=uaLnSRJvnuUZqahDeBOz%2FK8rf4DSXtNmqWkueOzLButZOzzIfz4mHqWuLXwbVzwPSZ2BE736J6cX1uttigP9RA%3D%3D&numOfRows=50&pageNo=1&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+"&arrAirportId="+FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+"&airlineId=AAR&_type=json");
			HttpURLConnection con =(HttpURLConnection)url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			StringBuilder sb=new StringBuilder();
			String input="";
			while((input=br.readLine())!=null) {
				sb.append(input);	
				System.out.println(input);
			}
			br.close();
			con.disconnect();
			
			Gson gson=new Gson();
			AirLineList flightInfo=gson.fromJson(sb.toString(), AirLineList.class);
			
			return flightInfo.getResponse().getBody().getTotalCount();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public static AirLineList getFlightInfo(String depAirportId, String arrAirportId, Long depPlandTime, int page){
		try {
			URL url=new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=uaLnSRJvnuUZqahDeBOz%2FK8rf4DSXtNmqWkueOzLButZOzzIfz4mHqWuLXwbVzwPSZ2BE736J6cX1uttigP9RA%3D%3D&numOfRows=50&pageNo="+page+"&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+"&arrAirportId="+FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+"&airlineId=AAR&_type=json");
			HttpURLConnection con =(HttpURLConnection)url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			StringBuilder sb=new StringBuilder();
			String input="";
			while((input=br.readLine())!=null) {
				sb.append(input);	
				System.out.println(input);
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
		FlightInfoService.setAirLineId();
		FlightInfoService.setAirPortId();
		
		for(String key : FlightInfoService.airPortId.keySet()) {
			System.out.print(key+" ");
		}
		System.out.println();
		System.out.println("출발지를 입력하세요.");
		
		Scanner sc=new Scanner(System.in);
		String depAirportId=sc.next();
		
		System.out.println("도착지를 입력하세요.");
		String arrAirportId=sc.next();
		
		System.out.println("출발일을 입력하세요.");
		Long depPlandTime=sc.nextLong();
		
		int page=1;
		
		int totalCount=getTotalCount(depAirportId, arrAirportId, depPlandTime);
		int count=0;
		if(totalCount%50==0) {
			count=totalCount/50;
		}else {
			count=totalCount/50+1;
		}
		
		ArrayList<AirLineList>flightInfos=new ArrayList<>();
		for (int i = 0; i < count; i++) {
			AirLineList flightInfo=getFlightInfo(depAirportId, arrAirportId, depPlandTime,page++);
			flightInfos.add(flightInfo);
		}
		
		for (AirLineList flightInfo : flightInfos) { // 3번 돌기
			
			//List<Item> myItem = flightInfo.getResponse().getBody().getItems().getItem();
			
			
			//iterable(반복) 
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
		
		sc.close();
			
		}
	
				

	}
}
