public class Main {

    public static void main(String[] args) {

        byte byteValue = 64;
        short shortValue = 1024;
        int intValue = 65536;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short Total = " + shortTotal);
        System.out.println("Long Total = " + longTotal);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);
    }
}
