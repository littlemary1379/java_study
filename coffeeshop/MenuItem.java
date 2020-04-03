package coffeeshop;
//클래스 자료형 : Beans
//책임은 없고 데이터만 가진 오브젝트

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
