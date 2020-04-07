package b;

//import a.DefaultData;
import a.PrivateData;
import a.ProtectedData;
import a.PublicData;

public class App extends ProtectedData{
	public static void main(String[] args) {
		PublicData p=new PublicData();
		System.out.println("public : "+p.num);
		
		//DefaultData d= new DefaultData();
		//System.out.println("default : "+d.num);
		
		PrivateData pd=new PrivateData();
		//System.out.println("private : "+pd.num);
		System.out.println("private : "+pd.getNum());
		
		App pt=new App();
		System.out.println("protected : " + pt.num);
	}
}
