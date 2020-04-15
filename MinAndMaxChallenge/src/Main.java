import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int num = scanner.nextInt();
                min = Math.min(num, min);
                max = Math.max(num, max);
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        scanner.close();
    }
}
