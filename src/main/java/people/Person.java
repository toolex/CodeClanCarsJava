package people;

import behaviours.IBuy;
import behaviours.ISell;
import dealership.Car;

public abstract class Person implements IBuy, ISell {
    private String name;
    protected Double money;

    public Person(String name, Double money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public Double getMoney() {
        return this.money;
    }

    public void buy(Car car) {
        this.money -= car.getPrice();
    }

    public void sell(Car car) {
        this.money += car.getPrice();
    }
}
