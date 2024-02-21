public class Main {
    public static void main(String[] args) {
            CreditCard my_card = new CreditCard("Samuel", "Bank Mandiri ", "Samuel235", 30000000, 2000000);


            System.out.println("Customer name: " + my_card.getCustomer() +
                    "\nAccount: " + my_card.getAccount() +
                    "\nBank: " + my_card.getBank() +
                    "\nCard limit: " + my_card.getLimit() +
                    "\nCurrent Balance: " + my_card.getBalance()
            );


            System.out.println("Transaction Successful: " + my_card.charge(200000));


            my_card.makePayment(2000000);
    }

}
