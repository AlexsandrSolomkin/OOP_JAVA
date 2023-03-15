package DZ_OOP_JAVA.DZ_SEMINAR_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", LocalDate.of(1977, 3, 11), null);
        Person vasya = new Person("Вася", LocalDate.of(1973, 1, 15), LocalDate.of(2019, 7, 30));
        Person masha = new Person("Маша", LocalDate.of(1999, 4, 7), null);
        Person jane = new Person("Женя", LocalDate.of(2010, 5, 1), null);
        Person ivan = new Person("Ваня", LocalDate.of(1990, 1, 19), null);

        GeoTree gt = new GeoTree();

        gt.append(irina, masha);
        gt.append(irina, jane);
        gt.append(irina, ivan);
        gt.append(vasya, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        
        System.out.println(new Reserch(gt).birthDay(irina));
        System.out.println("irina:");
        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));

        System.out.println(new Reserch(gt).birthDay(vasya));
        System.out.println("vasya:");
        System.out.println(new Reserch(gt).spend(vasya, Relationship.parent));

        System.out.println(new Reserch(gt).birthDay(masha));
        System.out.println("masha:");
        System.out.println(new Reserch(gt).spend(masha, Relationship.children));

        System.out.println(new Reserch(gt).birthDay(jane));
        System.out.println("jane:");
        System.out.println(new Reserch(gt).spend(jane, Relationship.children));

        System.out.println(new Reserch(gt).birthDay(ivan));
        System.out.println("ivan:");
        System.out.println(new Reserch(gt).spend(ivan, Relationship.children));

    }

}