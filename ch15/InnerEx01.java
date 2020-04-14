package ch15;


class MyOuterClass {
	int outerNum = 10;

	class MyInnerClass {

		int innerNum = 20;
	}
}

public class InnerEx01 {
	public static void main(String[] args) {
		MyOuterClass moc = new MyOuterClass();
		MyOuterClass.MyInnerClass d = moc.new MyInnerClass();
		System.out.println(d.innerNum);
	}
}
