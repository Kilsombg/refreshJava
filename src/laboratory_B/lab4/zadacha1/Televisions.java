package laboratory_B.lab4.zadacha1;

public class Televisions extends Stocks implements IElectricalAppliance{
    private final static double PROMO = 0.09;

    public String model;
    public String manufacture;
    public double power;

    public Televisions(String model, String manufacture, double power, double price, int numberID) throws PriceException {
        super(price, numberID);
        this.model = model;
        this.manufacture = manufacture;
        this.power = power;

        setPrice(getPrice() - checkPromo());
        if(price < 0) throw new PriceException();
    }

    @Override
    public double powerUsage(double voltage, double current) throws PowerException {
        if(voltage * current <= 0) throw new PowerException();
        return voltage * current;
    }

    @Override
    double checkPromo() {
        return PROMO * price;
    }
}
