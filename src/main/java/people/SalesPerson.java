package people;

import dealership.Car;

public class SalesPerson extends Person {

    public SalesPerson(String name, Double money) {
        super(name, money);
    }

    public String banCustomer(Customer customer){
        return customer.getName() + " you are banned!";
    }

    public void setNewPrice(Car car, Double price) { ;
        car.setPrice(price);
    }
}
