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
		pizza.setName("�ڹ�����");
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut=new Circle();
		donut.setRadius(2);
		donut.setName("�ڹٵ���");
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}
}
