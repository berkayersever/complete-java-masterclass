import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();                                 // Handle the next line character (Enter Key)
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;
        if(age > 0 && age < 100)
            System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        else
            System.out.println("Invalid year of birth!");
        scanner.close();
    }
}
