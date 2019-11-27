package dealership;

import org.junit.Before;
import org.junit.Test;
import people.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarDealershipTest {
    CarDealership carDealership;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void before() {

        this.car1 = new Car(200.0, "Ford", "Fiesta", "Petrol");
        this.car2 = new Car(300.0, "Volkswagen", "Golf", "Diesel");
        this.car3 = new Car(400.0, "Ford", "Focus", "Petrol");
        this.car4 = new Car(500.0, "Vauxhall", "Corsa", "Hybrid");
        this.car5 = new Car(600.0, "Mercedes-Benz", "A-Class", "Petrol");

        this.customer1 = new Customer("Tom", 500.0);
        this.customer2 = new Customer("Rory", 500.0);
        this.customer3 = new Customer("Sarah", 500.0);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        this.carDealership = new CarDealership(cars, 10000000.00);

    }

    @Test
    public void canSeeHowManyCarsInDealership(){
        assertEquals(5, carDealership.howManyCars());
    }

    @Test
    public void canGetListOfCustomersWhoAreBanned(){

    }
}
