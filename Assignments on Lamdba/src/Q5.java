import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Q5 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		Consumer<String> letter = (s) -> {
			sb.append(s.charAt(0));
		};
		List<String> ls = new ArrayList<>();
		ls.add("Hk");
		ls.add("AK");
		ls.add("MK");
		ls.add("CK");
		ls.add("PK");
		ls.add("DK");
		ls.add("NK");
		ls.add("LK");
		for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			letter.accept(string);

		}
		
		System.out.println(sb);
		
	}
}