package people;

import dealership.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Customer customer2;
    Car car;

    @Before
    public void before(){
        car = new Car(500.0, "Ford", "Focus", "Petrol");
        ArrayList<Car> hannahsCars = new ArrayList<Car>();
        hannahsCars.add(car);
        customer = new Customer("Jim", 10000.0);
        customer2 = new Customer("Hannah", 500.0, hannahsCars);
    }

    @Test
    public void canGetName(){
        assertEquals("Jim", customer.getName());
    }

    @Test
    public void canGetMoney(){
        assertEquals(10000.0, customer.getMoney(), 0.01);
    }

    @Test
    public void canBuyACar(){
        customer.buy(car);
        assertEquals(9500, customer.getMoney(), 0.01);
        assertEquals(1, customer.getListOfCars());
    }

    @Test
    public void canSellACar(){
        customer2.sell(car);
        assertEquals(1000, customer2.getMoney(), 0.01);
        assertEquals(0, customer2.getListOfCars());
    }

    @Test
    public void customerStartsWithNoCars(){
        assertEquals(0, customer.getListOfCars());
    }

    @Test
    public void customerCanStartWithCar(){
        assertEquals(1, customer2.getListOfCars());
    }
}
