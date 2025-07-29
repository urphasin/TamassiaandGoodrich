package Chapter1;

public class CreditCard {
    // Instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // Constructors
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    // Accessor methods
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    // Update methods
    public boolean charge(double price) {
        if (price + balance > limit)
        {
            return false;
        }
        balance += price;
        return true;
    }
    public void makePayment(double amount) {
        balance -= amount;
    }

    // Utility methods to print a card's information
    public void printSummary() {
        System.out.println("Customer = " + customer);
        System.out.println("Bank = " + bank);
        System.out.println("Account = " + account);
        System.out.println("Balance = " + balance);
        System.out.println("Limit = " + limit);
    }
}
