package ch04;

public class Circle {
	private int radius;
	private String name;
	
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza=new Circle();
		pizza.setRadius(10);
		pizza.setName("자바피자");
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut=new Circle();
		donut.setRadius(2);
		donut.setName("자바도넛");
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
