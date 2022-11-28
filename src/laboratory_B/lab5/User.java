package laboratory_B.lab5;

import java.util.regex.Pattern;

public class User implements IValidatePhone{
    private String name = null;
    private String password = null;
    private String number;

    public User(String name, String password, String number) {
        try{
            if(ValidateName.check(name)) this.name = name;
            else throw new WrongUserException();
        } catch (WrongUserException e) {
            throw new RuntimeException(e);
        }
        if(ValidatePassword.check(password)) this.password = password;

        try {
            if(validatePhoneNumber(number)) this.number = number;
        } catch (WrongPhoneNumberException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if(Pattern.matches("[0-9]{10}]", phoneNumber)) return true;
        else throw new WrongPhoneNumberException();
    }

    public String getName() {
        return name;
    }
}
