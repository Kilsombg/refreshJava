package laboratory_B.lab2.zadacha1;

public class Teacher extends Person {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    Teacher(Course course){
        this.course = course;
    }
}
