import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Trader {
	String name;
	String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Name:" + name + ", City:" + city ;
	}
	
	public static void main(String[] args) 
	{
		List<Trader> ls=Arrays.asList(
				new Trader("Mk","Haryana"),
				new Trader("TK","Up"),
				new Trader("Hk","Pune"),
				new Trader("Lk","Goa"),
				new Trader("PK","Mumbai"),
				new Trader("Ck","Indore")
				);
		
		System.out.println("Question no 9 -->");
		ls.stream().map(p-> p.city)  
		.distinct()
		.forEach(System.out::println);
		
		
		System.out.println("Question no 10 -->");
		ls.stream().filter(c->c.city.contains("Pune"))
		.map(c->c.name)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Question no 11 -->");
		ls.stream()
		.sorted(Comparator.comparing(Trader::getName))
        .forEach(System.out::println);
		
		System.out.println("Question no -->12");
		ls.stream()
		.filter(c-> c.getCity().contains("Indore"))
        .forEach(s->System.out.println(s));

	}
	
	

}
