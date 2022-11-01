package laboratory_B.lab2.zadacha2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test
    void checkPersonInheritance() {
        Student student = new Student("John", "123");
        student.setBirthDate("01.02.1965");

        assertTrue(student instanceof Person);
        assertEquals("John", student.getName());
        assertEquals("123", student.getFacultyNumber());
        assertEquals("01.02.1965", student.getBirthDate());
    }

    @Test
    void checkChangingMark() {
        Student student = new Student("","",6,6,6);

        student.setMarkPIK(3);
        student.setMarkTE(4);
        student.setMarkPPE(5);

        assertEquals(3,student.getMarkPIK());
        assertEquals(4,student.getMarkTE());
        assertEquals(5,student.getMarkPPE());
    }
}
