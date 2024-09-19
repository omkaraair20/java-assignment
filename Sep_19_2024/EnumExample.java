enum Day{
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday
}

public class EnumExample {
    public static void main(String[] args) {
    	Day today=Day.Thursday;
    	
    	switch(today) {
    	case Monday:
    		System.out.println("It's monday!");
    		break;
    	case Wednesday:
    		System.out.println("It's wednesday!");
    		break;
    	default:
    		System.out.println("It's not a special day.");
    	}
    	
    	Day[] daysOfWeek=Day.values();
    	for(Day day:daysOfWeek) {
    		System.out.println(day);
    	}
    }
}
