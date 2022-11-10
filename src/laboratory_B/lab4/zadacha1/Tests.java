package laboratory_B.lab4.zadacha1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    void booksTest() {
        // Arrange
        Books book = null;
        try {
             book = new Books("Viktor Frankl ", "Man's Search for Meaning", 15, 1 );
        } catch (PriceException e) {
            throw new RuntimeException(e);
        }

        // Act

        // Assert
        assertEquals(12.75, book.getPrice());
    }

    @Test
    void televisionTest() {
        // Arrange
        Televisions television = null;
        try {
            television = new Televisions("ARG32-1", "Samsung", 15, 1500, 2);
        } catch (PriceException e) {
            throw new RuntimeException(e);
        }

        // Act
        double power;
        try {
            power = television.powerUsage(4,3);
        } catch (PowerException e) {
            throw new RuntimeException(e);
        }

        // Assert
        assertEquals(1365., television.getPrice());
        assertEquals(12., power);
    }
}
