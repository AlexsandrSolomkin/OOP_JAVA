package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("Wardrone", 20, false, null);

        Shirt shirt = new Shirt("Shirt 1", 100, 5);
        Pants pants = new Pants("Pants 1", 100, 7);
        Shoes shoes = new Shoes("Shoes 1", 100, 7);

        ArrayList<Object> array = new ArrayList<>();
        array.add(shirt);
        array.add(pants);
        array.add(shoes);

        // wardrobe.getInfo();

        wardrobe.setInside(array);
        System.out.println();

        wardrobe.getInfo();

    }
}
