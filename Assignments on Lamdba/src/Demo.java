

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylamda hkm = () -> System.out.print("Heell");
		
		Mylength uml = (String v) ->v.length();
		System.out.println(uml.len("hello world"));
	}
	
	interface Mylamda{
		public void foo();
			
	}
	interface Mylength{
		int len(String d);
	}

}
