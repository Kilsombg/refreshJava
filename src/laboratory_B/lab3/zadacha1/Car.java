package laboratory_B.lab3.zadacha1;

public class Car extends Vehicle implements IsLandVehicle{

    private float enginePower;

    public Car(float enginePower, int maxSpeed, String model, int price) {
        super(maxSpeed, model, price);
        this.enginePower = enginePower;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.8;
    }

    @Override
    public void enterLand() {

    }
}
