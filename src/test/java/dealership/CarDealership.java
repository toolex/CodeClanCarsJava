package dealership;

import org.junit.Before;

public class CarDealership {
    CarDealership carDealership;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;

    @Before
    public void before(){
        this.carDealership = new CarDealership();
        this.car1 = new Car(200.0, "Ford", "Fiesta", "Petrol");
        this.car2 = new Car(300.0, "Volkswagen", "Golf", "Diesel");
        this.car3 = new Car(400.0, "Ford", "Focus", "Petrol");
        this.car4 = new Car(500.0, "Ford", "Fiesta", "Petrol");
        this.car5 = new Car(600.0, "Ford", "Fiesta", "Petrol");

}
