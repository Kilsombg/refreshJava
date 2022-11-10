package laboratory_B.lab4.zadacha1;

public abstract class Stocks {
    protected double price;
    protected int numberID;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    protected  Stocks() {};

    protected Stocks(double price, int numberID){
        this.price = price;
        this.numberID = numberID;
    }

    abstract double checkPromo();
}
