import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(  LocalDate.parse("2021-11-11").getDayOfWeek());
		
		System.out.println(  LocalDate.parse("2021-11-11").getDayOfMonth());
		
		LocalDate thisyear= LocalDate.now();
		System.out.println(thisyear.isLeapYear());
		
		LocalDate previousyear= LocalDate.now().minusYears(1);
		System.out.println(previousyear.isLeapYear());
		
		System.out.println( LocalDate.parse("2020-06-03").isBefore(LocalDate.parse("2021-05-04")));

	}

}
