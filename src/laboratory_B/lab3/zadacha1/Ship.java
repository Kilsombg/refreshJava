package laboratory_B.lab3.zadacha1;

public class Ship extends  Vehicle implements IsSeaVessel{
    private int deadweight;

    public Ship(int deadweight, int maxSpeed, String model, int price) {
        super(maxSpeed, model, price);
        this.deadweight = deadweight;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.997;
    }

    @Override
    public void enterSea() {

    }
}
