package laboratory_B.lab2.zadacha1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class zadacha1Test {

    @Test
    void PersonTest() {
        Teacher person = new Teacher(new Course(""));

        assertTrue(person instanceof Person);
        assertEquals(person.getCourse().getName(), new Course("").getName());
    }

    @Test
    void CourseTest() {
        Course course = new Course("test");

        course.setName("test123");

        assertEquals("test123",course.getName());
    }
}
