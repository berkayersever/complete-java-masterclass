public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            /* System.out.printf("$10.000 at %d%% interest is $%.1f %n", i, calculateInterest(10000.0, i)); */
            System.out.println("$10.000 at " + i + "% interest is $" + String.format("%.1f", calculateInterest(10000, i)));
        }
        System.out.println("********************************");
        for (int i = 9; i > 0 ; i--) {
            System.out.println("$10.000 at " + i + "% interest is $" + String.format("%.1f", calculateInterest(10000, i)));
        }
        System.out.println("********************************");
        int count = 0;
        for (int i = 20; i < 100 && count < 3; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number!");
                count++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
