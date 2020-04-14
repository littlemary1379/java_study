package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySockerServer {

	ServerSocket serverSocket;
	Vector<NewSocketThread>vt;
	

	public MySockerServer() throws Exception {
		vt=new Vector<>();
		serverSocket = new ServerSocket(3000);
		while (true) {
			Socket socket = serverSocket.accept(); // 컬렉션으로 소켓을 모아두지 않으면, 가장 최근의 소켓만 가리키게 됨
			System.out.println("요청이 들어옴");
			NewSocketThread nt = new NewSocketThread(socket);
			Thread newWorker = new Thread(nt);
			newWorker.start();
			vt.add(nt);
		}
	}

	// 새로운 스레드에게 버퍼를 연결할 수 있게 socket을 전달.
	class NewSocketThread implements Runnable {

		Socket socket;
		BufferedReader br;
		BufferedWriter bw;

		public NewSocketThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String msg="";
				while((msg=br.readLine())!=null) {
					System.out.println("클라이언트 : "+msg);
					for (NewSocketThread newSocketThread : vt) {
						if(newSocketThread !=this) {
							newSocketThread.bw.write(msg+"\n");
							newSocketThread.bw.flush();
						}
					}
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		try {
			new MySockerServer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
