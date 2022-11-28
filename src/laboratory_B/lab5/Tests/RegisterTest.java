package laboratory_B.lab5.Tests;

import laboratory_B.lab3.zadacha1.Car;
import laboratory_B.lab3.zadacha1.Hovercraft;
import laboratory_B.lab3.zadacha1.Ship;
import laboratory_B.lab5.User;
import laboratory_B.lab5.UserAlreadyExistException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest {

    private static Stream<Arguments> userDataValidation() {
        List<User> list = new ArrayList<User>();
        list.add(new User("John", "34fre", "1111111111"));
        return Stream.of(
                Arguments.of(new User("abracadbra", "pass123", "0123565789"), new ArrayList<User>()),
                Arguments.of(new User("norman14-re_2", "pass321", "1321235476"),list));
    }

    @ParameterizedTest
    @MethodSource("userDataValidation")
    void testingCorrectValidation(User user, List<User> list) throws UserAlreadyExistException {
        for(User u : list){
            if(u.getName().equals(user.getName())) throw new UserAlreadyExistException();
        }

        list.add(user);
        boolean isRegistered = list.contains(user);

        assertTrue(isRegistered);
    }
}
