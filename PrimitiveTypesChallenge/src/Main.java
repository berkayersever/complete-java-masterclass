public class Main {

    public static void main(String[] args) {

        byte byteValue = 64;
        short shortValue = 1024;
        int intValue = 65536;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short Total = " + shortTotal);
        System.out.println("Long Total = " + longTotal);
    }
}
