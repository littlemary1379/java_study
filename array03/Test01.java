package array03;

public class Test01 {

	public static void main(String[] args) {
		char arr[]= {'가','나','다','라','마'};
		char arr2[]= new char[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			int j=arr.length-1-i;
			arr2[j]=arr[i];
			
		}	
		
		System.out.println(arr2);
		
/*		arr2[4]=arr[0];
		arr2[3]=arr[1];
		arr2[2]=arr[2];
		arr2[1]=arr[3];
		arr2[0]=arr[4];
		
		System.out.println(arr2);
*/
		}
}
