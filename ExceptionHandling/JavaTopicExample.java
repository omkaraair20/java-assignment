package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.*;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class JavaTopicExample {
    public static void exceptionsExample(){
        int[] numbers={1,2,3};
        System.out.println(numbers[4]);
    }

    public static void exceptionHandlingExample() {
        try{
            int result=10/0;
        }catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException:"+e.getMessage());
        }
    }

    public static void tryCatchExample(){
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException:"+e.getMessage());
        }finally{
            System.out.println("This block always executes");
        }
    }
    public static void throwAndThrowsExample() throws CustomException{
        throw new CustomException("This is a custom exception");
    }
    public static void catchMultipleExceptionsExample() {
        try{
            // Some code that may throws exceptions
        }
        catch(IOException e){
            // Handle IOException
        }
        catch(SQLException e){
            // Handle SQLException
        }
    }
    public static void tryWithResourcesExample() {
        try(FileInputStream fis=new FileInputStream("example.txt")){
            // Use the file input stream
        }catch(IOException e){
            // Handle IO exception
        }
    }

    @interface MyAnnotation{
        String value();
    }

    @MyAnnotation("This is sample annotation")
    public static class AnnotationExample{
        // Class content
    }

    public static void loggingExample(){
        Logger logger=Logger.getLogger(JavaTopicExample.class.getName());
        logger.info("This is an info message");
        logger.warning("This is a warning message");
    }
    public static void assertionsExample() {
        int age=-1;
        assert age>=0 : "Age cannot be negative";
    }
    public static void main(String[] args) {
        exceptionsExample();
        exceptionHandlingExample();
        tryCatchExample();
        try{
            throwAndThrowsExample();
        }catch(CustomException e){
            System.out.println("Caught CustomException:"+e.getMessage());
        }
        catchMultipleExceptionsExample();
        tryWithResourcesExample();
        loggingExample();
        assertionsExample();
    }

    
}
