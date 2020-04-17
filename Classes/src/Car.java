public class Car {

    private int doors;
    private int modelYear;
    private int wheels;
    private String color;
    private String engine;
    private String model;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("gt500")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getModelYear() {
        return this.modelYear;
    }
}
