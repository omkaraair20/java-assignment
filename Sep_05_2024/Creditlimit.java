public class Creditlimit {
    private double limit; 

    public Creditlimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double newLimit) {
        if (newLimit > 0) {
            limit = newLimit;
            System.out.println("Credit limit updated to: " + limit);
        } else {
            System.out.println("Invalid limit. It must be greater than zero.");
        }
    }

    private boolean exceedsLimit(double amount) {
        return amount > limit;
    }

    public void makePurchase(double amount) {
        if (exceedsLimit(amount)) {
            System.out.println("Transaction declined. Amount exceeds credit limit.");
        } else {
            System.out.println("Transaction approved. Amount: " + amount);
        }
    }

    public static void main(String[] args) {
        Creditlimit myCredit = new Creditlimit(1000.00);
        System.out.println("Current Credit Limit: " + myCredit.getLimit());

        myCredit.makePurchase(500.00);
        myCredit.makePurchase(1500.00);

        myCredit.setLimit(2000.00);
        System.out.println("Updated Credit Limit: " + myCredit.getLimit());
    }
}