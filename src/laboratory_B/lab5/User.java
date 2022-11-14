package laboratory_B.lab5;

import java.util.regex.Pattern;

public class User implements IValidatePhone{
    private String name = null;
    private String password = null;
    private String number;

    public User(String name, String password, String number) {
        if(ValidateName.check(name)) this.name = name;
        if(ValidatePassword.check(password)) this.password = password;
        this.number = number;
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if(Pattern.matches("[0-9]{10}]", phoneNumber)) return true;
        else throw new WrongPhoneNumberException();
    }
}
