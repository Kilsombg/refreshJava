package laboratory.sedmica_5;

public class Vehicle {
    protected String brand = "Ford";
    public void hank() {
        System.out.println("Tuut, tuut");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.hank();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
