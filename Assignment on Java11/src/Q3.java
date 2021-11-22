import java.util.ArrayList;
import java.util.List;

public class Q3 
{
	public static void main(String[] args)
	{
		String s="A quick brown fox jumps over the lazy dog";
		s.lines().forEach(System.out::println);
		
		List<String> ls=new ArrayList<>();
		ls.add("A");
		ls.add("quick");
		ls.add("brown");
		ls.add("fox");
		ls.add("jumps");
		ls.add("over");
		ls.add("the");
		ls.add("lazy");
		ls.add("dog");
		
		
		System.out.println(ls);
		String [] p=ls.stream().toArray(size ->new String [size]);

	}

}