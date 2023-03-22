package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("Wardrone", 30, false, null);
        Scanner scanner = new Scanner(System.in);

        Shirt shirt = new Shirt("Shirt 1", 100, 5);
        Pants pants = new Pants("Pants 1", 100, 7);
        Shoes shoes = new Shoes("Shoes 1", 100, 7);

        ArrayList<Things> arrayWardrobe = new ArrayList<>();
        arrayWardrobe.add(shirt);
        arrayWardrobe.add(pants);
        arrayWardrobe.add(shoes);

        Person person = new Person(null);

        Shirt shirt2 = new Shirt("Shirt 2", 50, 5);
        Pants pants2 = new Pants("Pants 2", 50, 7);
        Shoes shoes2 = new Shoes("Shoes 2", 50, 7);

        ArrayList<Things> arraeyListPerson = new ArrayList<>();
        arraeyListPerson.add(shirt2);
        arraeyListPerson.add(pants2);
        arraeyListPerson.add(shoes2);

        wardrobe.setInside(arrayWardrobe);
        System.out.println();
        wardrobe.getInfo();

        person.setEquipment(arraeyListPerson);
        person.getInfo();

        System.out.println("\nОткрыть ящик:\n1 - ДА\n2 - НЕТ\n");
        int answer = scanner.nextInt();

        if (answer == 1) {
            wardrobe.setContainerOpen(true);

            while (wardrobe.isContainerOpen()) {
                System.out.println("\n1 - Положить вещь\n2 - Взять вещь\n3 - закрыть");
                answer = scanner.nextInt();

                if (answer == 1) {
                    person.getInfo();
                    int count = 0;
                    for (Things things : person.getEquipment()) {
                        System.out.printf("\n%d - Name: %s\nPurity: %d\nSizeClothes: %d\n", count, things.getName(),
                                things.getPurity(), things.getSizeClothes());
                        count++;
                    }
                    System.out.println("\nПоложить:");
                    answer = scanner.nextInt();

                    ArrayList<Things> elementsWardrobe = wardrobe.getInside();
                    ArrayList<Things> elementsPerson = person.getEquipment();
                    elementsWardrobe.add(elementsPerson.get(answer));

                    wardrobe.setInside(elementsWardrobe);
                    wardrobe.getInfo();

                    elementsPerson.remove(answer);
                    person.setEquipment(elementsPerson);
                    person.getInfo();

                } else if (answer == 2) {
                    // wardrobe.getInfo();
                    // System.out.println("Name:");
                    // answer = scanner.nextInt();


                    wardrobe.getInfo();
                    int count = 0;
                    for (Things things : wardrobe.getInside()) {
                        System.out.printf("\n%d - Name: %s\nPurity: %d\nSizeClothes: %d\n", count, things.getName(),
                                things.getPurity(), things.getSizeClothes());
                        count++;
                    }
                    System.out.println("\nВзять:");
                    answer = scanner.nextInt();

                    ArrayList<Things> elementsWardrobe = wardrobe.getInside();
                    ArrayList<Things> elementsPerson = person.getEquipment();
                    elementsPerson.add(elementsWardrobe.get(answer));

                    person.setEquipment(elementsPerson);
                    person.getInfo();

                    elementsWardrobe.remove(answer);
                    wardrobe.setInside(elementsWardrobe);
                    wardrobe.getInfo();

                } else if (answer == 3) {
                    wardrobe.setContainerOpen(false);

                } else {
                    System.out.println("Я не могу этого сделать.");
                }
            }

        } else if (answer == 2) {
            System.out.println("Скрип...");

        } else {
            System.out.println("Я не могу этого сделать.");
        }
        scanner.close();
    }
}
