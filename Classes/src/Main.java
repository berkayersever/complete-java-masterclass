public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car mustang = new Car();
        porsche.setModelYear(2020);
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel() + ", and the model year is " + porsche.getModelYear());
    }
}
