import java.util.HashMap;
import java.util.Map.Entry;

public class Q7 {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "Gk");
		hs.put(2, "Tk");
		hs.put(3, "Dk");
		hs.put(4, "Hm");
		hs.put(5, "Hc");
		hs.put(6, "Jf");
		hs.put(7, "Dm");
		hs.put(8, "Hm");
		System.out.println(hs);
		
		System.out.print("Converting Entire Hashmap into String: ");
		
		StringBuilder sb = new StringBuilder();
		
		for (Entry<Integer, String> entry: hs.entrySet()) 
		{
			sb.append(entry +" ");
			
		}
		
		System.out.println(sb );
	}

}
