package array03;

public class StarEx02 {
	static void printStarts(int i) {
		for (int j = 0; j < 4-i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
/*			if(i==1) {
				System.out.print("___");
				System.out.println("*");
			}
			if(i==2) {
				System.out.print("__");
				System.out.println("**");
			}
			if(i==3) {
				System.out.print("_");
				System.out.println("***");
			}
			if(i==4) {
				System.out.print("");
				System.out.println("****");
			} */
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			printStarts(i);
		}

	
	}

}
