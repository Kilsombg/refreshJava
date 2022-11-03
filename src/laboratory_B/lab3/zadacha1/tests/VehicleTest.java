package laboratory_B.lab3.zadacha1.tests;

import laboratory_B.lab3.zadacha1.Car;
import laboratory_B.lab3.zadacha1.Hovercraft;
import laboratory_B.lab3.zadacha1.Ship;
import laboratory_B.lab3.zadacha1.Vehicle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private static Stream<Arguments> dataCheckPromo() {
        return Stream.of(
                Arguments.of(new Car(210f, 180, "STR12", 2500), 2000.),
                Arguments.of(new Hovercraft(20, 80, "LTC-2", 3200), 3104.),
                Arguments.of(new Ship(1500,  50, "WRT-310", 5000), 4985.)
        );
    }

    @ParameterizedTest
    @MethodSource("dataCheckPromo")
    void checkPromoMethod(Vehicle vehicle, double expected){
        assertEquals(expected, vehicle.checkPromo());
    }
}
