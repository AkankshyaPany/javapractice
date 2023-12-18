/******************************************************************************
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

Class	Description
LocalDate            	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime            	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime       	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	    Formatter for displaying and parsing date-time objects
*******************************************************************************/
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Javatime_package
{
	public static void main(String[] args) {
	    LocalDateTime obj = LocalDateTime.now();
	    LocalDate obj1 = LocalDate.now();
	    LocalTime obj2 = LocalTime.now();
	    
	    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String mydata = obj1.format(df);
	    
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(mydata);
	}
}
