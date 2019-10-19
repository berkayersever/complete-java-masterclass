public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // 4 % 3 = 1 (The remainder of 4 % 3 = 1)
        System.out.println("4 % 3 = " + result);

        result++;               // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;               // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2;            // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10;           // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3;            // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 2;            // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is TRUE!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is TRUE!");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("My values total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0.00d) ? true : false;
        System.out.println("Is there any remainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
