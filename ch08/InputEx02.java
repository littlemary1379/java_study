package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//ĳ���� ���� ���ڷ� �б�
//�� �� �̻��� �ޱ�(�߰�������...)

public class InputEx02 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		char[] data=new char[3]; //call by reference : return�� �ʿ����.
		try {
			reader.read(data);
			System.out.println(data); //�޸𸮳��� �����, �� �����ʹ� ���� �� ����.(���������� ����)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
