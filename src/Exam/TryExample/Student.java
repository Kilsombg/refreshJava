package Exam.TryExample;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Grade> grades;

    public Student(String facultyNumber, String EGN) {
        super(facultyNumber, EGN);
        grades = new ArrayList<>();
    }

    @Override
    UserType getUserType() {
        return null;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
}
