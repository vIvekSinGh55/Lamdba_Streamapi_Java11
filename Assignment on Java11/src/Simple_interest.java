

public class Simple_interest 
{

	
	@FunctionalInterface
	interface simpleinterest
	{
		int operations(int amount, int rate,int year);
	}
	

	public static void main(String[] args)
	{
		var amount=150000;
		var rate=7.8;
		var year=1.5;
		System.out.println("The simple interest is:"+(amount*year*rate)/100);

	}

}