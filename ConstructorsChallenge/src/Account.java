public class Account {

    private String number;
    private double balance;
    private String customerEmail;
    private String customerName;
    private String customerPhone;

    public Account() {
        System.out.println("Empty constructor has been called!");
    }

    public Account(String number, double balance, String customerEmail, String customerName, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("Insufficient Funds. Only " + this.balance + " available.");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance: " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
