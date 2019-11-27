package people;

import dealership.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesPersonTest {
    SalesPerson salesPerson;
    Customer customer;
    Car car;

    @Before
    public void before(){
        salesPerson = new SalesPerson("Bob", 100000.0);
        car = new Car(500.0, "Ford", "Focus", "Petrol");
        customer = new Customer("Jim", 10000.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", salesPerson.getName());
    }

    @Test
    public void canGetMoney(){
        assertEquals(100000.0, salesPerson.getMoney(), 0.01);
    }

    @Test
    public void canBuyACar(){
        salesPerson.buy(car);
        assertEquals(99500, salesPerson.getMoney(), 0.01);
    }

    @Test
    public void canSellACar(){
        salesPerson.sell(car);
        assertEquals(100500, salesPerson.getMoney(), 0.01);
    }

    @Test
    public void canSetAPrice(){
        salesPerson.setNewPrice(car, 555.5);
        salesPerson.sell(car);
        assertEquals(100555.5, salesPerson.getMoney(), 0.01);
    }

    @Test
    public void canBanCustomer(){
        assertEquals("Jim you are banned!", salesPerson.banCustomer(customer));
    }
}
