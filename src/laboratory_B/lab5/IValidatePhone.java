package laboratory_B.lab5;

public interface IValidatePhone {
    boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException;
}
