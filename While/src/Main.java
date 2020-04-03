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
        System.out.println("********");
        int number = 4;
        int finish = 20;

        while(number <= finish) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number: " + number);
        }
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}