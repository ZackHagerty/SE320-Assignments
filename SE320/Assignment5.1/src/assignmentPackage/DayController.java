package assignmentPackage;
import java.time.LocalDate;

public class DayController {

	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		
		Day today = new Day(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
		
		Day birthday = new Day(2001,5,7);
		
		System.out.println("Zack Hagerty was born " + today.daysFrom(birthday) + " days ago. Don't forget to get him an awesome birthday gift Dr. Akbas");
	}
}
