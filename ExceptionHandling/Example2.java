package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        
    
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your height:");
        int height=sc.nextInt();

        System.out.println("Your name:"+name);
        System.out.println("Your age:"+age);
        int BMI=age/height;
        System.out.println("BMI:"+BMI);
    }
    catch(InputMismatchException e){
        System.out.println("Enter only number......");
    }
    catch(ArithmeticException e){
        System.out.println("do not enter.....");
    }
}
}
 

