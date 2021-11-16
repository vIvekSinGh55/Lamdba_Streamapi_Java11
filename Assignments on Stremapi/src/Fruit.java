import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	
	String name;
	int calories;
	int price;
	String color;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "FruitName: "+ name +" FruitCalories: "+calories+" FruitPrice: "+price+" FruitColor: "+color;
	}
	
	public static void main(String[] args) {
		
		List<Fruit> fs= Arrays.asList(
				new Fruit("Watermelon",84,140,"Green"),
				new Fruit("Apple",70,120,"Red"),
				new Fruit("Mango",100,70,"Yellow"),
				new Fruit("Banana",58,92,"Yellow"),
				new Fruit("Orange",82,150,"Orange")
			);
		
		System.out.println("Question No:1 -->");
		List<Fruit> ls= fs.stream()
				.filter(p ->p.getCalories()<100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println("Fruits with calories are less than 100 are:");
		ls.forEach(System.out::println);
		
		
		System.out.println("Question No:2 -->");
		List<Fruit> colorList=fs.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		System.out.println("Colorwise fruits is:");
		colorList.forEach(System.out::println);
		
		System.out.println("Question No:3 -->");
		fs.stream()
				.filter(p->p.getColor().contains("Red"))
				.sorted(Comparator.comparingInt(Fruit::getPrice))
				.forEach(System.out::println);
		
	}
	
	

}
