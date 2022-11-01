package laboratory_B.lab2.zadacha2;

import java.util.HashMap;

public class Student extends Person {
    private final String facultyNumber;
    HashMap<String, Integer> marks = new HashMap<>();

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public Integer getMarkPIK() {
        return marks.get("PIK");
    }

    public void setMarkPIK(Integer mark) {
        marks.put("PIK", mark);
    }

    public Integer getMarkTE() {
        return marks.get("TE");
    }

    public void setMarkTE(Integer mark) {
        marks.put("TE", mark);
    }

    public Integer getMarkPPE() {
        return marks.get("PPE");
    }

    public void setMarkPPE(Integer mark) {
        marks.put("PPE", mark);
    }

    public Student(String name, String facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
    }

    public Student(String name, String facultyNumber, int markPIK, int markTE, int markPPE) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.marks.put("PIK", markPIK);
        this.marks.put("TE", markTE);
        this.marks.put("PPE", markPPE);
    }
}
