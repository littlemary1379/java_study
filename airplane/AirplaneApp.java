package airplane;

import java.util.List;

import com.google.gson.Gson;

public class AirplaneApp {
	public static void main(String[] args) {
		String jsonData="{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL SERVICE.\"},\"body\":{\"items\":{\"item\":[{\"airlineNm\":\"티웨이항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071025,\"depAirportNm\":\"광주\",\"depPlandTime\":202004070930,\"vihicleId\":\"TW901\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071045,\"depAirportNm\":\"광주\",\"depPlandTime\":202004070955,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8141\"},{\"airlineNm\":\"제주항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071105,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071000,\"vihicleId\":\"7C601\"},{\"airlineNm\":\"대한 항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071115,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071010,\"economyCharge\":57900,\"prestigeCharge\":82900,\"vihicleId\":\"KE1901\"},{\"airlineNm\":\"티웨이항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071255,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071210,\"vihicleId\":\"TW903\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071340,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071245,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8143\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071530,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071440,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8145\"},{\"airlineNm\":\"티웨이항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071530,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071445,\"vihicleId\":\"TW905\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071855,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071800,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8147\"},{\"airlineNm\":\"제주항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071920,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071830,\"vihicleId\":\"7C605\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004072015,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071920,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8149\"},{\"airlineNm\":\"대한 항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004072025,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071925,\"economyCharge\":57900,\"prestigeCharge\":82900,\"vihicleId\":\"KE1907\"},{\"airlineNm\":\"티웨이항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004072105,\"depAirportNm\":\"광주\",\"depPlandTime\":202004072015,\"vihicleId\":\"TW907\"},{\"airlineNm\":\"진 에어\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004072130,\"depAirportNm\":\"광주\",\"depPlandTime\":202004072040,\"vihicleId\":\"LJ595\"}]},\"numOfRows\":50,\"pageNo\":1,\"totalCount\":14}}}";
		System.out.println(jsonData);
		Gson gson=new Gson();
		AirLineList airLineList=gson.fromJson(jsonData, AirLineList.class);
		List<Item> item = airLineList.getResponse().getBody().getItems().getItem();
		System.out.println(item.get(0).getAirlineNm());
		System.out.println(airLineList.getResponse().getBody().getItems().getItem().get(0).getArrAirportNm());
	}
}
