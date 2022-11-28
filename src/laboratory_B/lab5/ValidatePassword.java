package laboratory_B.lab5;

import java.util.regex.Pattern;
public class ValidatePassword {
    public static boolean check(String password) {
        return Pattern.matches("[a-zA-Z0-9]{11,}", password);
    }
}
