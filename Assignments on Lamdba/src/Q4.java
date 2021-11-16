import java.util.ArrayList;
import java.util.List;

public class Q4
{
	public static void main(String[] args)
	{
		
		List<String> lt = new ArrayList<>();
		lt.add("GK");
		lt.add("HKC");
		lt.add("MK");
		lt.add("NKHK");
		lt.add("PK");
		lt.add("QKUKI");
		lt.add("RK");
		lt.add("SKL");


		
		System.out.println("Objects in The List:");

		for (String list : lt) 
		{
			System.out.println(list);
		}
		
		

		lt.removeIf(p -> (p.length() % 2 != 0));
		System.out.println("After Removing odd length objects:");

		for (String list1: lt)
		{
			System.out.println(list1);
		}
		
	}
}
