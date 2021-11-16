import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class Myclass implements UnaryOperator<String>
{
		@Override
		public String apply(String l) {
			return l.toUpperCase();
		}
}



public class Q6 
{
	public static void main(String[] args) 
	{
		List<String> ls = new ArrayList<>();
		ls.add("hkc");
		ls.add("gkc");
		ls.add("jyt");
		ls.add("pyt");
		ls.add("trw");
		ls.add("der");
		ls.add("qsx");
		ls.add("mfs");
		ls.replaceAll(new Myclass());
		
		System.out.println(ls);
		

		
	}
}
