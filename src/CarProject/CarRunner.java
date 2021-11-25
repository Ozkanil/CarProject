package CarProject;

public class CarRunner {

    public static void main(String[] args) {

        Car car1= new Honda();

        System.out.println(car1.carModel());
        System.out.println(car1.carMake());
        System.out.println(car1.carPrice());
        System.out.println(car1.carYear());

        car1=new Honda("Accord",2014,15000);
        System.out.println(car1.carYear());

        System.out.println(car1.price);



    }
}
