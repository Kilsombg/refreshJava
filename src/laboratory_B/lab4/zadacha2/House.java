package laboratory_B.lab4.zadacha2;

import java.util.List;

public class House extends Building {
    private int floors;
    private String name;

    public House(int floors, String name, int height, double area, String address) {
        super(height, area, address);
        this.floors = floors;
        this.name = name;
    }

    public static House spacious(List<House> houseList) {
        House spaciousHouse = houseList.get(0);
        double spacious = (double) spaciousHouse.height / spaciousHouse.floors;
        for (House house : houseList) {
            if (spacious < (double) house.height / house.floors) spaciousHouse = house;
        }
        return spaciousHouse;
    }
}
