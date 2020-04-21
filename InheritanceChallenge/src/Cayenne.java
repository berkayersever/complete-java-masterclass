public class Cayenne  extends Car {

    private int roadServiceMonths;

    public Cayenne(int roadServiceMonths) {
        super("Cayenne", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
