package laboratory_B.lab2.zadacha3;

public class Laptop extends Device {
    private int storageRAM;
    private int storageHDD;

    public int getStorageRAM() {
        return storageRAM;
    }

    public int getStorageHDD() {
        return storageHDD;
    }

    public Laptop(int storageRAM, int storageHDD, double supplyVoltage, String model) {
        super(supplyVoltage, model);
        this.storageRAM = storageRAM;
        this.storageHDD = storageHDD;
    }

   public boolean isBetter(Laptop laptop){
       return storageHDD > laptop.getStorageHDD() && storageRAM > laptop.getStorageRAM();
   }

    @Override
    public String toString() {
        return "Laptop:"
                + "\nmodel: " + this.getModel()
                + "\nRAM: " + this.storageRAM + " GB"
                + "\nHDD: " + this.storageHDD + " GB"
                + "\nsupplyVoltage: " + this.getSupplyVoltage() + " V";
    }
}
