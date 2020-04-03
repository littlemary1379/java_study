package composite;

import lombok.Data;

@Data //Getter, Setter 추가
public class Burger {
	private int price;
	private String desc;
	
	public Burger() {
		this(1500,"기본 버거");
		
	}
	
	// 최종목적지
	public Burger(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"가 만들어졌습니다.");
		System.out.println("가격은"+price+"입니다.");
	}
	
}
