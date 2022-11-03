package laboratory_B.lab3.zadacha2;

public class Excursion extends Trip implements ITraveling {
    private final int hotelCount;

    public Excursion(String destination, int days, double price, int hotelCount) {
        super(destination, days, price);
        this.hotelCount = hotelCount;
    }

    @Override
    void fixPrice(double price) {
        this.setPrice(price * 1.1);
    }

    @Override
    public int overnightStays() {
        return this.getDays() - 2;
    }
}
