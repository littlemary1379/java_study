package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1=new String("나무");
		String s2=new String("나무");
		
		System.out.println(s1==s2); //다른 공간
		
		String s3="나무";
		String s4="나무";
		
		System.out.println(s3==s4); //같은 공간
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4)); //문자열을 비교할 때 이쪽이 안전함(==을 처음 비교, false면 실제 값 비교. 둘 중 하나가 같으면 true)
	}

}
