package dealership;

import java.util.ArrayList;

public class CarDealership {

    private ArrayList<Car> cars;
    private Double money;

    public CarDealership(ArrayList<Car> cars, Double money){
        this.cars = cars;
        this.money = money;
    }

    public Double getMoney() {
        return this.money;
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }


}
