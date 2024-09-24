public class AccessModifiersExample {
	   public int publicVar = 10; 
	   private int privateVar = 20;
	   int defaultVar = 30; 
	   protected int protectedVar = 40; 

	    // Public constructor
	    public AccessModifiersExample() {
	        System.out.println("Public constructor called.");
	    }

	    // Private constructor
	    private AccessModifiersExample(int num) {
	        System.out.println("Private constructor called with parameter: " + num);
	    }

	    // Default constructor
	    AccessModifiersExample(String str) {
	        System.out.println("Default constructor called with parameter: " + str);
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("Protected method called.");
	    }

	    // Public method
	    public void publicMethod() {
	        System.out.println("Public method called.");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("Private method called.");
	    }

	    // Default (package-private) method
	    void defaultMethod() {
	        System.out.println("Default method called.");
	    }

	    public static void main(String[] args) {
	        AccessModifiersExample example = new AccessModifiersExample();

	        System.out.println("Public variable: " + example.publicVar);
	        System.out.println("Private variable: " + example.privateVar);
	        System.out.println("Default variable: " + example.defaultVar);
	        System.out.println("Protected variable: " + example.protectedVar);

	        example.publicMethod();
	        example.defaultMethod();
	        example.protectedMethod();
	        example.privateMethod(); 

	       
	        AccessModifiersExample publicConstructorExample = new AccessModifiersExample();
	        AccessModifiersExample defaultConstructorExample = new AccessModifiersExample("Default");
	        AccessModifiersExample privateConstructorExample = new AccessModifiersExample(123); 
	    }
	}

