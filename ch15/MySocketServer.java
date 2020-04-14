package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader br;
	
	public MySocketServer() throws Exception{ //throw : try�� �����. ��ü try catch ������ ���
	
		serverSocket=new ServerSocket(15000); //���� ����(������ �޴�)
		socket=serverSocket.accept(); //��û���, ��Ʈ�� �ڵ� ����
		System.out.println("��û�� ����");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String msg="";
		while ((msg=br.readLine())!=null) {
			System.out.println("��� : "+msg);
		}
		br.close();
		socket.close();
		serverSocket.close();

		
		
	}

	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			// throw�� catch�� ������ ���� �ʾƼ�, catch�� ȣ���ڿ��� ��
			e.printStackTrace();
		}

	}

}
