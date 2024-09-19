import java.time.Month;

enum Months{
	January,
	February,
	March,
	April,
	May,
	June,
	July,
	August,
	September,
	October,
	November,
	December
}

public class EnumExample1 {

	public static void main(String[] args) {
		   Month today=Month.SEPTEMBER;
		   
		   switch(today) {
		   case FEBRUARY:
			   System.out.println("It's February");
			   break;
		   case APRIL:
			   System.out.println("It's April");
			   break;
		   default:
			   System.out.println("It's is not special month.");
		   }
		   
		   Month[] monthOfWeek=Month.values();
		   for(Month month:monthOfWeek) {
			   System.out.println(month);
		   }
	}

}
