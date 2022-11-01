package laboratory_B.lab2.zadacha3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {

    public static Stream<Arguments> dataWorseLaptop() {
        return Stream.of(
                Arguments.of(new Laptop(8, 1024, 15, ""),
                        new Laptop(4, 512, 15, "")),
                Arguments.of(new Laptop(16, 2048, 20, ""),
                        new Laptop(8, 512, 15, ""))
        );
    }

    public static Stream<Arguments> dataBetterLaptop() {
        return Stream.of(
                Arguments.of(new Laptop(8, 1024, 15, ""),
                        new Laptop(16, 1024, 15, "")),
                Arguments.of(new Laptop(16, 2048, 20, ""),
                        new Laptop(20, 1024, 15, ""))
        );
    }

    @ParameterizedTest
    @MethodSource("dataWorseLaptop")
    void compareToWorseLaptop(Laptop laptop, Laptop worseLaptop) {
        assertTrue(laptop.isBetter(worseLaptop));
    }

    @ParameterizedTest
    @MethodSource("dataBetterLaptop")
    void compareToBetterLaptop(Laptop laptop, Laptop betterLaptop) {
        assertFalse(laptop.isBetter(betterLaptop));
    }

    @Test
    void toStringMethod() {
        Laptop laptop = new Laptop(16, 1024, 15, "LTS10-2");

        assertEquals(
                "Laptop:"
                        + "\nmodel: " + "LTS10-2"
                        + "\nRAM: " + 16 + " GB"
                        + "\nHDD: " + 1024 + " GB"
                        + "\nsupplyVoltage: " + 15.0 + " V",
                laptop.toString()
        );
    }
}
