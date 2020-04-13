package mask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import mask.MaskList.StoreInfos;

public class MaskApp {
	public static int getTotalPages() {
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			br.close();
			con.disconnect();
			Gson gson = new Gson();
			MaskList maskList = gson.fromJson(sb.toString(), MaskList.class);

			return maskList.getTotalPages();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static MaskList GetPharmacyInfo(int page) {
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page="+ page);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			br.close();
			con.disconnect();
			Gson gson = new Gson();
			MaskList maskList = gson.fromJson(sb.toString(), MaskList.class);
			return maskList;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {


		ArrayList<MaskList> Pharmacy = new ArrayList<>();
		int total = getTotalPages();
		for (int i = 1; i <= total; i++) {
			MaskList GetPharmacy = GetPharmacyInfo(i);
			Pharmacy.add(GetPharmacy);
		}
		System.out.println("지역을 입력해주세요.");
		Scanner sc=new Scanner(System.in);
		String area=sc.next();
		for (MaskList m : Pharmacy) {
			for (StoreInfos storyInfo : m.getStoreInfos()) {
				if(storyInfo.getAddr().contains(area)) {
					System.out.println(storyInfo.getAddr());
				}
			}
		}
		
		sc.close();
	}

}