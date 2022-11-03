package laboratory_B.lab3.zadacha3;

public abstract class Patient {
    private String name;
    private String address;
    private String EGN;

    public Patient(String name, String address, String EGN) {
        this.name = name;
        this.address = address;
        this.EGN = EGN;
    }

    abstract void cure(String medicine, int dose);
}
