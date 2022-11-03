package laboratory_B.lab3.zadacha2;

public class Vacation extends Trip{
    private String hotelName;

    public Vacation(String destination, int days, double price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    @Override
    void fixPrice(double price) {
        setPrice(price * 1.4);
    }
}
