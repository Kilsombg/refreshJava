package laboratory_B.lab3.zadacha3;

import java.util.ArrayList;
import java.util.List;

public class SickPatient extends Patient{
    private String disease;
    private List<String> medicines = null;
    private Status status;
    private int dayOfYear;

    public SickPatient(String name, String address, String EGN) {
        super(name, address, EGN);
        this.medicines = new ArrayList<>();
    }

    @Override
    void cure(String medicine, int dose) {
        this.medicines.add(medicine + " used " + dose + " mg dose");
    }
}
