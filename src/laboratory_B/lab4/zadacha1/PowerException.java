package laboratory_B.lab4.zadacha1;

public class PowerException extends Throwable {
    @Override
    public String getMessage() {
        return "Incorrect power value!";
    }
}
