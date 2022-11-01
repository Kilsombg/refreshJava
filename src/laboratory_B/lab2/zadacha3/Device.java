package laboratory_B.lab2.zadacha3;

public class Device {
    private double supplyVoltage;
    private String model;
    private boolean isTurnedOn = false;

    public double getSupplyVoltage() {
        return supplyVoltage;
    }

    public String getModel() {
        return model;
    }

    public void setTurnedOn() {
        isTurnedOn = !isTurnedOn;
    }

    public boolean getStatus() {
        return isTurnedOn;
    }

    public Device() {
    }

    public Device(double supplyVoltage, String model) {
        this.supplyVoltage = supplyVoltage;
        this.model = model;
    }
}
