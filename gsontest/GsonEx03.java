package gsontest;

import com.google.gson.Gson;

public class GsonEx03 {

	public static void main(String[] args) {
		//1. �ٿ� ���� json data
		String jsonData="{\"name\":\"�ڽ�\",\"age\":40}";
		System.out.println(jsonData);
		//2. json data -> json object ��ȯ
		Gson gson=new Gson();
		People people=gson.fromJson(jsonData, People.class);
		System.out.println(people.getName());
		System.out.println(people.getAge());
	}

}
