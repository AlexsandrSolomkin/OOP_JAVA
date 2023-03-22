package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Person{
    private ArrayList<Things> equipment = new ArrayList<>();
    
    public Person(ArrayList<Things> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<Things> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Things> equipment) {
        this.equipment = equipment;
    }

    public void getInfo() {
        System.out.print("\nEquipment:");

        for (Things object : equipment) {
            System.out.printf("\nName: %s\nPurity: %d\nSizeClothes: %d\n", object.getName(), object.getPurity(),
                    object.getSizeClothes());
        }
    }
}