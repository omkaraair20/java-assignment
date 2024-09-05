public class MainClass {
    public static void main(String[] args) {
        // Create a new CreditLimit object with an initial limit
        Creditlimit myCredit = new Creditlimit(1000.00);
        
        // Display the current credit limit
        System.out.println("Current Credit Limit: " + myCredit.getLimit());

        // Attempt to make a purchase
        myCredit.makePurchase(500.00);  
        myCredit.makePurchase(1500.00); 
        // Update the credit limit
        myCredit.setLimit(2000.00);
        System.out.println("Updated Credit Limit: " + myCredit.getLimit());

        // Attempt to make another purchase
        myCredit.makePurchase(1800.00); 
    }
}