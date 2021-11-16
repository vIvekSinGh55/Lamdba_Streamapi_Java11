import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Test {
	public static void main(String[] args) {
		LocalDate ld =  LocalDate.now();
		System.out.println(ld);
		
		
		Clock clock = Clock.systemDefaultZone(); 				
		LocalDate ld1= LocalDate.now(clock);
		System.out.println(ld1);
		
		ZoneId zoneId=ZoneId.of("Asia/Kolkata");
		LocalDate ld2= LocalDate.now(zoneId);
		
		System.out.println(ld2);
		
		
		LocalDate ld4= LocalDate.of(1852, 2, 4);
		System.out.println(ld4);
		
		LocalDate ld5 = LocalDate.parse("2021-11-02");
		System.out.println(ld5);
		
		LocalDate ld6 = ld5.plusDays(9);
		System.out.println(ld6);
		
		LocalDate ld7 = ld5.minus(2,ChronoUnit.DAYS);
		System.out.println(ld7);
	}

}
