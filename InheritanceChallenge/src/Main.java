public class Main {

    public static void main(String[] args) {
        Cayenne cayenne = new Cayenne(36);
        cayenne.steer(45);
        cayenne.accelerate(30);
        cayenne.accelerate(20);
        cayenne.accelerate(-45);
    }
}
