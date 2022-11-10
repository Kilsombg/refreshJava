package laboratory_B.lab4.zadacha1;

public class Books extends  Stocks {
    private final static double PROMO = 0.15;

    private final String autor;
    private final String name;

    public Books(String author, String name, double price, int numberID) throws PriceException {
        super(price, numberID);
        this.autor = author;
        this.name = name;

        setPrice(getPrice() - checkPromo());
        if(price < 0) throw new PriceException();
    }

    @Override
    double checkPromo() {
        return PROMO * price;
    }
}
