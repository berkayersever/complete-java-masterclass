public class Main {

    public static void main(String[] args) {
        /*int count = 1;
        while(count != 6) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("********");
        for (count = 1; count != 6; count++) {
            System.out.println("Count: " + count);
        }
        System.out.println("********");*/
        /*int count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("********");*/
        /*int count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while(count != 6);
        System.out.println("********");*/
        int evenNumberCount = 0;
        int number = 4;
        int finish = 20;

        while(number <= finish) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even Number: " + number);
            evenNumberCount++;
            if(evenNumberCount == 5) {
                break;
            }
            number++;
        }
        System.out.println("***************");
        System.out.println("Total Number of Even Numbers Found: " + count);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}