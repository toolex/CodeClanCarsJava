package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        this.car = new Car(500.0, "Ford", "Focus", "Petrol");
    }

    @Test
    public void carHasPriceMakeModelAndFuelType(){
        assertEquals(500.0, car.getPrice(), 0.01);
        assertEquals("Ford", car.getMake());
        assertEquals("Focus", car.getModel());
        assertEquals("Petrol", car.getFuelType());
    }

}
