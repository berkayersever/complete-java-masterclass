public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        }
        else if (value == 2) {
            System.out.println("Value was 2");
        }
        else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Value: " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
        // More code to be executed after the the break statement
        char charValue = 'E';
        switch (charValue) {
            case 'A': case 'B': case'C': case'D': case'E':
                System.out.println(charValue + " is found!");
                break;
            default:
                System.out.println("A, B, C, D, E not found!");
                break;
        }
        String month = "April";
        switch (month) {
            case "January": case "February": case "March:":
                System.out.println(month);
                break;
            default:
                System.out.println("Not sure!");
                break;
        }
    }
}
