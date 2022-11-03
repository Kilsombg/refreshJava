package laboratory_B.lab3.zadacha1;

public class Hovercraft extends Vehicle implements IsSeaVessel{

    private final int passengers;

    public Hovercraft(int passengers, int maxSpeed, String model, int price) {
        super(maxSpeed, model, price);
        this.passengers = passengers;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.97;
    }

    @Override
    public void enterSea() {

    }
}
