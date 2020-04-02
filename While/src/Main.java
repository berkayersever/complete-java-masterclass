public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("********");
        for (count = 1; count != 6; count++) {
            System.out.println("Count: " + count);
        }
    }
}