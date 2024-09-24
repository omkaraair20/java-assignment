// Final keyword

public class cwp {
       final double PI = 3.14;

	   final void displayPI() {
		   System.out.println("The value of PI is: " + PI);
	   }

	   public static void main(String[] args) {
		     cwp example = new cwp();
		     System.out.println("Accessing the final variable PI: " + example.PI);
		     example.displayPI();
	   }
}


