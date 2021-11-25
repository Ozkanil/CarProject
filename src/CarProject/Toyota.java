package CarProject;

public class Toyota extends  Car{

    private String make= "Toyota";
    private String model= "Camry";
    private int year=2015;
    private double price= 14000;

    @Override
    String carMake() {
        return this.make;
    }

    @Override
    String carModel() {
        return this.model;
    }

    @Override
    int carYear() {
        return this.year;
    }

    @Override
    double carPrice() {
        return this.price;
    }
}
