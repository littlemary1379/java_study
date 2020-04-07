package coffeeshop;

import lombok.Data;

@Data
public class Coffee {
	private String name;
	private int price;

	public Coffee(MenuItem meunitem) {

		this.name = meunitem.getName();
		this.price = meunitem.getPrice();
	}
	
	
}
