public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // System.out.printf("$10.000 at %d%% interest is $%.1f %n", i, calculateInterest(10000.0, i));
            System.out.println("$10.000 at " + i + "% interest is $" + String.format("%.1f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
