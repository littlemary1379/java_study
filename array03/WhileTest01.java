package array03;

public class WhileTest01 {
	public static void main(String[] args) {
		int description=12000;
		int speed=3;
		int car=0;
		int i=1;
		
		while(description!=car) {
			car=car+speed;
			i++;
		}
		System.out.println(i+"��");
		int min=i/60;
		System.out.println(min+"��");
		int hour=min/60;
		System.out.println(hour+"�ð�");
		double time=min;
		System.out.println(time/60+"�ð�");
		int realMin=min%60;
		System.out.println(realMin+"��");
		
		System.out.println(hour+"�ð�"+realMin+"��");
	}
}