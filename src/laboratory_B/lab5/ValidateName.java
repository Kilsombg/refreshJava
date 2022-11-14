package laboratory_B.lab5;

import java.util.regex.Pattern;

public class ValidateName {
    public static boolean check(String name) {
        return Pattern.matches("[a-zA-Z0-9-_]{3,15}", name);
    }
}
