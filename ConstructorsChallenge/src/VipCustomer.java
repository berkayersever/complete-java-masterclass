public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("John", 5000, "john@doe.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 2000, emailAddress);
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
