package laboratory_B.lab4.zadacha1;

public class PriceException extends Throwable {
    @Override
    public String getMessage() {
        return "Incorrect price!";
    }
}
