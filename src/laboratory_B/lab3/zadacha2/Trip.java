package laboratory_B.lab3.zadacha2;

public abstract class Trip {
    private String destination;
    private int days;
    private double price;

    public int getDays() {
        return days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip(String destination, int days, double price){
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    abstract void fixPrice(double price);
}
