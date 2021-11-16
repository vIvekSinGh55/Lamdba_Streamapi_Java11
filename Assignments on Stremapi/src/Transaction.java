import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Transaction {
	Trader trade;
	int year;
	int value;
	
	public Trader getTrade() {
		return trade;
	}
	public void setTrade(Trader trade) {
		this.trade = trade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Transaction(Trader trade, int year, int value) 
	{
		super();
		this.trade = trade;
		this.year = year;
		this.value = value;
	}
	
	@Override
	public String toString() 
	{
		return "Trade:" + trade + ", Year:" + year + ", Value:" + value ;
	}
	
	
	public static void main(String[] args)
	{
		List<Transaction> ls = Arrays.asList(
				new Transaction(new Trader("mk", "Mumbai"), 2019, 5050),
                new Transaction(new Trader("gk", "Pune"), 2011, 6060),
                new Transaction(new Trader("pk", "Thane"), 2015, 4040),
                new Transaction(new Trader("ok", "Nashik"), 2011, 3030),
                new Transaction(new Trader("ck", "Delhi"), 2018, 4545));
		
		System.out.println("Question no -->08");
		ls.stream().filter(x->x.getYear()==2011)
		.sorted(Comparator.comparingInt(Transaction::getValue))
        .forEach(System.out::println);
		
		System.out.println("Question no -->13");
		ls.stream()
		.filter(p->p.getTrade().getCity().contains("Delhi"))
        .map(Transaction::getValue)
        .forEach(System.out::println);
		
		System.out.println("Question no -->14");
		ls.stream()
		.sorted(Comparator.comparingInt(Transaction::getValue).reversed())
        .limit(1)
        .map(Transaction::getValue)
        .forEach(System.out::println);
		
		
		System.out.println("Question no -->15");
		ls.stream()
		.sorted(Comparator.comparingInt(Transaction::getValue))
        .limit(1)
        .forEach(System.out::println);
		
		
		
	}

}
