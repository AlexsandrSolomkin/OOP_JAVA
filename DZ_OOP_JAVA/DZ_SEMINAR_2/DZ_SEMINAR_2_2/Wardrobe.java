package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;

import java.util.ArrayList;
/**
 * (частное) Шкаф --> (общее) Хранилище, емкость
 */
public class Wardrobe extends Сontainer{

    public Wardrobe(String name, int capacitySize, boolean containerOpen, ArrayList<Things> inside) {
        super(name, capacitySize, containerOpen, inside);
    }
    
}
