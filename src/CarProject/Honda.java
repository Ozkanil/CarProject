package CarProject;

public class Honda extends Car {

    private String make= "Honda";
    private String model="Accord";
    private int year=2012;
    private double price=8000;

    static {
        System.out.println("Honda is a nice car");
    }

    public Honda() {
    }

    public Honda(String model, int year, double price) {
        super(model, year,price);
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    String carMake() {
        return "Car make: "+this.make;
    }

    @Override
    String carModel() {
        return "Car model: "+this.model;
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
