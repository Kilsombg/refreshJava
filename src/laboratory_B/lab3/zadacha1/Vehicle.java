package laboratory_B.lab3.zadacha1;

public abstract class Vehicle {
    private int maxSpeed;
    private String model;
    private int price;

    public int getPrice() {
        return price;
    }

    public Vehicle(int maxSpeed, String model, int price) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.price = price;
    }

    public   abstract   double   checkPromo();
}
