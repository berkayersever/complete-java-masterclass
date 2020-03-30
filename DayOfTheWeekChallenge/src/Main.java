public class Main {

    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final String INVALID_DAY = "Invalid Day";

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            printDayOfTheWeek(i);
        }
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println("Using switch\t:\t" + DAYS[day]);
                break;
            default:
                System.out.println("Using switch\t:\t" + INVALID_DAY);
                break;
        }
        if (0 <= day && day <= 6) {
            System.out.println("Using if...else\t:\t" + DAYS[day]);
        }
        else {
            System.out.println("Using if...else\t:\t" + INVALID_DAY);
        }
    }
}
