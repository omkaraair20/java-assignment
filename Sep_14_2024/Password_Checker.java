import java.util.Scanner;

public class Password_Checker {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       
	       String setPassword,enterPassword;
	       
	       System.out.println("Set your password:");
	       setPassword=sc.nextLine();
	       
	       System.out.println("Enter your password:");
	       enterPassword=sc.nextLine();
	       
	       int selectAnswer;
	       
	       if(setPassword.equals(enterPassword)) {
	    	   System.out.println("Your password is correct...");
	    	   System.out.println("1.Who invented java programming?");
	    	   System.out.println("1) Guido var rossum");
	    	   System.out.println("2) James gosling");
	    	   System.out.println("3) Dennis ritchie");
	    	   System.out.println("4) Bjarne stroustru");
	    	   
	    	   System.out.println("Select answer");
	    	   selectAnswer=sc.nextInt();
	    	   
	    	   switch(selectAnswer) {
	    	   case 2:
	    		   System.out.println("Your answer is correct...");
	    		   System.out.println("2.Which component is used to complie,debug and execute the java program?");
	    		   System.out.println("1) JRE");
	    		   System.out.println("2) JIT");
	    		   System.out.println("3) JDK");
	    		   System.out.println("4) JVM");
	    		  
	    		   System.out.println("Select your answer");
	    		   selectAnswer=sc.nextInt();
	    		   
	    		   switch(selectAnswer) {
	    		   case 3:
	    			   System.out.println("your answer is correct");
	    			   break;
	    			   
	    			   default:
	    				   System.out.println("Your answer is incorrect try next year...");
	    				   break;
	    		   }
	    		   break;
	    		   
	    		   default:
	    			   System.out.println("Your answer is incorrect try next year....");
	    			   break;
	    	   }
	       }else if(!setPassword.equals(enterPassword)) {
	    		   System.out.println("Password is incorrect try 3 times");
	    		   
	    		   System.out.println("Enter your password:");
	    		   enterPassword=sc.nextLine();
	    		   
	    		   if(setPassword.equals(enterPassword)) {
	    			   System.out.println("Your password is correct....");
	    			   System.out.println("1.Who invented java programming?");
	    	    	   System.out.println("1) Guido var rossum");
	    	    	   System.out.println("2) James gosling");
	    	    	   System.out.println("3) Dennis ritchie");
	    	    	   System.out.println("4) Bjarne stroustru");
	    	    	   
	    	    	   System.out.println("Select Answer:");
	    	    	   selectAnswer=sc.nextInt();
	    	    	   
	    	    	   switch(selectAnswer) {
	    	    	   case 2:
	    	    		   System.out.println("Your answer is correct...");
	    	    		   System.out.println("2.Which component is used to complie,debug and execute the java program?");
	    	    		   System.out.println("1) JRE");
	    	    		   System.out.println("2) JIT");
	    	    		   System.out.println("3) JDK");
	    	    		   System.out.println("4) JVM");
	    	    		   
	    	    		   System.out.println("Select your answer");
	    	    		   selectAnswer=sc.nextInt();
	    	    		   
	    	    		   switch(selectAnswer) {
	    	    		   case 3:
	    	    			   System.out.println("your answer is correct");
	    	    			   break;
	    	    			   
	    	    			   default:
	    	    				   System.out.println("Your answer is incorrect try next year...");
	    	    				   break;
	    	    		   }
	    	    		   break;
	    	    		   
	    	    		   default:
	    	    			   System.out.println("Password is incorrect try 2 times");
	    	    			   
	    	    			   System.out.println("Enter your password:");
	    	    			   enterPassword=sc.nextLine();
	    	    			   if(setPassword.equals(enterPassword)) {
	    	    				   System.out.println("1.Who invented java programming?");
	    	    				   System.out.println("1.Who invented java programming?");
	    		    	    	   System.out.println("1) Guido var rossum");
	    		    	    	   System.out.println("2) James gosling");
	    		    	    	   System.out.println("3) Dennis ritchie");
	    		    	    	   System.out.println("4) Bjarne stroustru");
	    		    	    	   
	    		    	    	   System.out.println("Select answer:");
	    		    	    	   selectAnswer=sc.nextInt();
	    		    	    	   
	    		    	    	   switch(selectAnswer) {
	    		    	    	   
	    		    	    	   case 2:
	    		    	    		   System.out.println("Your answer is correct");
	    		    	    		   System.out.println("2.Which component is used to complie,debug and execute the java program?");
	    		    	    		   System.out.println("1) JRE");
	    		    	    		   System.out.println("2) JIT");
	    		    	    		   System.out.println("3) JDK");
	    		    	    		   System.out.println("4) JVM");
	    		    	    		   
	    		    	    		   System.out.println("Select your answer:");
	    		    	    		   selectAnswer=sc.nextInt();
	    		    	    		   
	    		    	    		   switch(selectAnswer) {
	    		    	    		   case 3:
	    		    	    			   System.out.println("your answer is correct");
	    		    	    			   break;
	    		    	    			   default:
	    		    	    				   System.out.println("Your answer is incorrect try next year.....");
	    		    	    				   break;
	    		    	    		   }
	    		    	    		   break;
	    		    	    		   
	    		    	    		   default:
	    		    	    			   System.out.println("Your answer is incorrect try next year....");
	    		    	    			   break;
	    		    	    		   
	    	    	   }
	    		   }else {
	    			   System.out.println("Time out....");
	    		   }
	    	   }
	       
	       
	}

	    	   }
	       }
}