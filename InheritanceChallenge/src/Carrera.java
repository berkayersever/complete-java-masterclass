public class Carrera extends Car {

    private int roadServiceMonths;

    public Carrera(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Carrera", size, wheels, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }
}
