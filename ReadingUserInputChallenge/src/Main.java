import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, sum = 0;
        while(counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();     // Handle the next line character (Enter Key)
        }
        System.out.println("Sum of the numbers = " + sum);
        scanner.close();
    }
}
