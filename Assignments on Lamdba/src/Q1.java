
public class Q1 {

	interface Test{
		int num(int a,int b);
	}
	
	public static void main(String[] args) 
	{
		Test Myadd = (int a,int b) -> (a+b);          //lamdba for add
		System.out.println(Myadd.num(8, 5));
		
		
		
		Test Mymin = (int a,int b) -> (a-b);         //lamdba for Minus
		System.out.println(Mymin.num(8, 5));
		
		
		
		Test Mydiv = (int a,int b) -> (a/b);        // lamdaba for Division
		System.out.println(Mydiv.num(8, 2));

	}
	
	

}
