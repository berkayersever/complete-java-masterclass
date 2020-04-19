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

        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Java", 6000);
        VipCustomer vipCustomer3 = new VipCustomer("Python", 9999, "python@gmail.com");

        System.out.println("Name: " + vipCustomer1.getName() + ", Credit Limit: " + vipCustomer1.getCreditLimit() + ", Email: " + vipCustomer1.getEmailAddress());
        System.out.println("Name: " + vipCustomer2.getName() + ", Credit Limit: " + vipCustomer2.getCreditLimit() + ", Email: " + vipCustomer2.getEmailAddress());
        System.out.println("Name: " + vipCustomer3.getName() + ", Credit Limit: " + vipCustomer3.getCreditLimit() + ", Email: " + vipCustomer3.getEmailAddress());
    }
}
