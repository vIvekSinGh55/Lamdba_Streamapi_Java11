
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Q8
{
	public static void main(String[] args) 
	{
		
		Consumer<Integer> number = (i) -> System.out.println(i);
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(58);
		li.add(13);
		li.add(45);
		li.add(75);
		li.add(18);
		li.add(21);

		for (Iterator iterator = li.iterator(); iterator.hasNext();) 
		{
			Integer integer = (Integer) iterator.next();
			number.accept(integer);
		}
		Thread Th = new Thread();
		Th.run();
	}
}
	

