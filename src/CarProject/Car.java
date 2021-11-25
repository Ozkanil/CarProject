package CarProject;

public abstract class Car {

    String make;
    String model;
    int year;
    double price;

    static{
        System.out.println("Car is on its way");
    }

    public Car() {

    }

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    abstract String carMake();
    abstract String carModel();
    abstract int carYear();
    abstract double carPrice();


}