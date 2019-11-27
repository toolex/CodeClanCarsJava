package people;

import dealership.Car;

import java.util.ArrayList;

public class Customer extends Person {

    private ArrayList<Car> customersCars;

    public Customer(String name, Double money) {
        super(name, money);
        customersCars = new ArrayList<Car>();
    }

    public Customer(String name, Double money, ArrayList<Car> customersCars) {
        super(name, money);
        this.customersCars = customersCars;
    }

    public int getListOfCars() {
        return customersCars.size();
    }

    public void buy(Car car) {
        if (this.money >= car.getPrice()){
        this.money -= car.getPrice();
        customersCars.add(car);}
    }

    public void sell(Car car) {
        if (customersCars.size() > 0){
        this.money += car.getPrice();
        customersCars.remove(car);}
    }

}
