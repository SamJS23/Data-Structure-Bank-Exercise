public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;
    public CreditCard(String cus, String bank, String ba, int lim, int bal){
        customer = cus;
        this.bank = bank;
        account = ba;
        limit = lim;
        balance = bal;
    }
    public String getCustomer(){ return customer;}
    public String getBank(){ return bank;}
    public String getAccount(){ return account;}
    public double getBalance(){ return balance;}
    public int getLimit(){ return limit;}
    public boolean charge(double price){return price <= limit;}
    public void makePayment(double amount) {System.out.println("This amount has been paid: " + amount);}
}
