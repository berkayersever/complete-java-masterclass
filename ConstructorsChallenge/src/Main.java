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
        myAccount.withdraw(52.5);

        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);

        Account csAccount = new Account("cs@live.com", "CS", "(535) 987-65-43");
        System.out.println("Account Number: " + csAccount.getNumber() + ", Name: " + csAccount.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Java", 6000);
        VipCustomer customer3 = new VipCustomer("Python", 9999, "python@gmail.com");

        System.out.println("Name: " + customer1.getName() + ", Credit Limit: " + customer1.getCreditLimit() + ", Email: " + customer1.getEmailAddress());
        System.out.println("Name: " + customer2.getName() + ", Credit Limit: " + customer2.getCreditLimit() + ", Email: " + customer2.getEmailAddress());
        System.out.println("Name: " + customer3.getName() + ", Credit Limit: " + customer3.getCreditLimit() + ", Email: " + customer3.getEmailAddress());
    }
}
