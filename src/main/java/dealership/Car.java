package dealership;

public class Car {

    protected Double price;
    private String make;
    private String model;
    private String fuelType;

    public Car(Double price, String make, String model, String fuelType){
        this.price = price;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
