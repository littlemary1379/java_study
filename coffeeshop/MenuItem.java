package coffeeshop;
//Ŭ���� �ڷ��� : Beans
//å���� ���� �����͸� ���� ������Ʈ

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MenuItem {
	private String name;
	private int price;
}