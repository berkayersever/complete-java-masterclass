public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("********");
        for (count = 1; count != 6; count++) {
            System.out.println("Count: " + count);
        }
        System.out.println("********");
        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("********");
        count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while(count != 6);
    }

    public static boolean isEvenNumber(int num) {
        if(num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}