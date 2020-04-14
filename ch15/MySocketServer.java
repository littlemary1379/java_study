package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader br;
	
	public MySocketServer() throws Exception{ //throw : try를 대신함. 전체 try catch 구간에 사용
	
		serverSocket=new ServerSocket(15000); //소켓 생성(연결을 받는)
		socket=serverSocket.accept(); //요청대기, 포트는 자동 설정
		System.out.println("요청이 들어옴");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String msg="";
		while ((msg=br.readLine())!=null) {
			System.out.println("상대 : "+msg);
		}
		br.close();
		socket.close();
		serverSocket.close();

		
		
	}

	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			// throw는 catch를 가지고 있지 않아서, catch를 호출자에게 줌
			e.printStackTrace();
		}

	}

}
