package ch08;

import java.io.IOException;
import java.io.InputStream;

//��Ʈ��(byte) -> ���� �帧
//���� �带 �� ���������� ��ŵθ� ���� �帣�� ����.
// ����θ� ���� �帧. (��� ����)
//�� = byte
public class InputEx01 {
	public static void main(String[] args) {
		InputStream in = System.in; //Ű���忡 ����� ����Ʈ ��Ʈ��. int ���� �ޱ� ������ ���� ĳ���� �������. 
		try {
			int data = in.read();
			System.out.println((char)data); //�������� �ѹ��� ���� �� ����. char�� ��ĳ���� �ؾ� ���ڷ� �޾���.
		} catch (IOException e) { //e = ������ ������ heap ����
			System.out.println("IO ������ �߻�");
			//e.getMessage(); // �߻��� ������ �˷���
			//e.printStackTrace(); // �� ������ ���� �Ͼ �߰����� ������ ����
			
		}
	}
}
