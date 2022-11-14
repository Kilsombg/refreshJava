package laboratory_B.lab4.zadacha1;

public interface IElectricalAppliance {
    double powerUsage(double voltage, double current) throws PowerException;
}
