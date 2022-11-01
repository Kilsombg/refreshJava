package laboratory_B.lab2.zadacha4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CPUTest {

    public static Stream<Arguments> dataClockRateCalculation() {
        return Stream.of(
                Arguments.of(new CPU(2, 2, 3.3), 7.392),
                Arguments.of(new CPU(4, 1, 2.5), 8),
                Arguments.of(new CPU(1, 4, 3.1), 8.68)
        );
    }

    public static Stream<Arguments> dataTakenTime() {
        return Stream.of(
                Arguments.of(new CPU(2, 2, 3.3), 2.5, 5.6),
                Arguments.of(new CPU(4, 1, 2.5), 3, 9.6),
                Arguments.of(new CPU(1, 4, 3.1), 2, 5.6)
        );
    }

    @ParameterizedTest
    @MethodSource("dataClockRateCalculation")
    void checkClockRateCalculation(CPU cpu, double expected) {
        assertEquals(expected, cpu.calculateClockRate());
    }

    @ParameterizedTest
    @MethodSource("dataTakenTime")
    void checkTakenTime(CPU cpu, double time, double expected) {
        assertEquals(expected, cpu.takenTime(time));
    }
}
