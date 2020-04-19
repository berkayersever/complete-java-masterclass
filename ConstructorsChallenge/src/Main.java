public class Main {

    public static void main(String[] args) {

        /*Account myAccount = new Account("123456789", 0.0, "John Doe", "john@doe.com", "(532) 987-65-43");*/
        Account myAccount = new Account();
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());
        /*myAccount.setNumber("123456789");*/
        /*myAccount.setBalance(0);*/
        /*myAccount.setCustomerName("John Doe");*/
        /*myAccount.setCustomerEmail("john@doe.com");*/
        /*myAccount.setCustomerPhone("(532) 987-65-43");*/

        myAccount.withdraw(100.0);
        myAccount.deposit(50.0);
        myAccount.withdraw(100.0);

        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);

        Account csAccount = new Account("cs@live.com", "CS", "(535) 987-65-43");
        System.out.println("Account Number: " + csAccount.getNumber() + ", Name: " + csAccount.getCustomerName());
    }
}
