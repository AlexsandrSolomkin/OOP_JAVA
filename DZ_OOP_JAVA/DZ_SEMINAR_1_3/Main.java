package DZ_OOP_JAVA.DZ_SEMINAR_1_3;

public class Main {
    public static void main(String[] args) {
        String nameCat = "Вася";
        Cat cat = new Cat(nameCat, false, false);
        Human person = new Human();

        System.out.println(person.voice("кис-кис", nameCat));

        if (!cat.isSleep()) {
            System.out.println(cat.voice());

        } else {
            System.out.println(cat.voiceSleep());
            System.out.println(person.voice("Идем, ", nameCat));
            System.out.println(cat.voice());
        }

        System.out.println(person.getEat("Корм?"));

        if (!cat.isHungry()) {
            System.out.println(cat.noHungry());

        } else {
            System.out.println(cat.eatAll());
        }
    }
}