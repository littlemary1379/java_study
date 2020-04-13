package ch13;


//os는 runnable 타입의 heap 공간에 run 메서드를 호출해야한다는 것을 알고 있
class Sub implements Runnable{ //os가 찾음, 인터페이스 간 약속
	
	
	@Override
	public void run() { 
		//이름이 정해져있음. 시스템콜을 이용해 os가 들고 있는 기능 사용.
		for (int i = 1; i < 11; i++) {
			System.out.println("서브 스레드 : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {
	
	//메인 스레드
	public static void main(String[] args) {
		Thread t1=new Thread(new Sub());
		t1.start();
		for (int i = 1; i < 6; i++) {
			System.out.println("메인 쓰레드 : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
