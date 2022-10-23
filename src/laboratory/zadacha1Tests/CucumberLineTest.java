package laboratory.zadacha1Tests;

import laboratory.zadacha1.Crate;
import laboratory.zadacha1.CucumberLine;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CucumberLineTest {

    public static Stream<Arguments> dataCucumberLine() {
        return Stream.of(
                Arguments.of(new CucumberLine(100), 10),
                Arguments.of(new CucumberLine(50), 5)
        );
    }

    @ParameterizedTest
    @MethodSource(value = {"dataCucumberLine"})
    void checkProduction(CucumberLine dataCucumberLine, int dataCratesCount) {
        List<Crate> crates = dataCucumberLine.produce(1);

        assertEquals(dataCratesCount, crates.size());
    }
}