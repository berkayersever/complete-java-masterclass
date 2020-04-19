public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();
        myAccount.setNumber("123456789");
        myAccount.setBalance(0);
        myAccount.setCustomerName("John Doe");
        myAccount.setCustomerEmail("john@doe.com");
        myAccount.setCustomerPhone("(532) 987-65-43");

        myAccount.withdraw(100.0);
        myAccount.deposit(50.0);
        myAccount.withdraw(100.0);

        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);
    }
}
