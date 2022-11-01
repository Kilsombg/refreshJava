package laboratory_B.lab2.zadacha2;

public class Person {
    protected String name;
    private String birthDate;

    public String getName() {
        return name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(){
    }
}
