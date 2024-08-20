package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1{
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int age;
            int height;
            System.out.println("Enter age:");
            age=sc.nextInt();
            System.out.println("Enter height:");
            height=sc.nextInt();

            System.out.println("age:"+age);
            System.out.println("height:"+height);
            int BMI=age/height;
            System.out.println("BMI:"+BMI);
        }
        catch(InputMismatchException e){
            System.out.println("Enter only number.....");
        }
        catch(ArithmeticException e){
            System.out.println("Please do not enter zero....");
        }
    }
}