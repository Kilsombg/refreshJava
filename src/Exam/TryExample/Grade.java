package Exam.TryExample;

import java.io.Serializable;

public class Grade implements Serializable {
    private String subject;
    private int semester;
    private int grade;

    public Grade(String subject, int semester, int grade) {
        this.subject = subject;
        this.semester = semester;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", semester=" + semester +
                ", grade=" + grade +
                '}';
    }
}
