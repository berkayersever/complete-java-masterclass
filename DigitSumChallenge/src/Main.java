public class Main {

    public static void main(String[] args) {
        System.out.printf("Sum of the digits in number %d: " + sumDigits(125) + "\n", 125);
        System.out.printf("Sum of the digits in number %d: " + sumDigits(-125) + "\n", -125);
        System.out.printf("Sum of the digits in number %d :" + sumDigits(4) + "\n", 4);
        System.out.printf("Sum of the digits in number %d: " + sumDigits(32123) + "\n", 32123);
    }

    private static int sumDigits(int number) {

        System.out.print("");
        if(number < 10) {
            return -1;
        }
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
