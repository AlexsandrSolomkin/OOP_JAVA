package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;

import java.util.ArrayList;

/**
 * Абстрактный класс для любых емкостей, хранилиш
 */
public abstract class Сontainer {
    private String name;
    private int capacitySize;
    private boolean containerOpen;
    private ArrayList<Things> inside;

    /**
     * Данные о хранилище:
     * 
     * @param name          - название хранилища
     * @param capacitySize  - свободного места осталось
     * @param containerOpen - открыть дверь/закрыть дверь true/false
     * @param inside        - содержимое
     */

    public Сontainer(String name, int capacitySize, boolean containerOpen, ArrayList<Things> inside) {
        this.name = name;
        this.capacitySize = capacitySize;
        this.containerOpen = containerOpen;
        this.inside = inside;
    }

    public int getCapacitySize() {
        return capacitySize;
    }

    public void setCapacitySize(int capacitySize) {
        this.capacitySize = capacitySize;
    }

    public boolean isContainerOpen() {
        return containerOpen;
    }

    public void setContainerOpen(boolean containerOpen) {
        this.containerOpen = containerOpen;
    }

    public ArrayList<Things> getInside() {
        return inside;
    }

    public void setInside(ArrayList<Things> inside) {
        this.inside = inside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.printf("Capacity size: %d\n", getCapacitySize());
        System.out.print("\nInside:");

        for (Things object : inside) {
            System.out.printf("\nName: %s\nPurity: %d\nSizeClothes: %d\n", object.getName(), object.getPurity(),
                    object.getSizeClothes());
        }
    }

}
