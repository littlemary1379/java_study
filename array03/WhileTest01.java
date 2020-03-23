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
		System.out.println(i+"초");
		int min=i/60;
		System.out.println(min+"분");
		int hour=min/60;
		System.out.println(hour+"시간");
		double time=min;
		System.out.println(time/60+"시간");
		int realMin=min%60;
		System.out.println(realMin+"분");
		
		System.out.println(hour+"시간"+realMin+"분");
	}
}