public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("My string is equal to '" + myString + "'");
        myString += ", and this is more.";
        System.out.println("My string is equal to '" + myString + "'");
        myString += " \u00A92019";
        System.out.println("My string is equal to '" + myString + "'");
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

    }
}
