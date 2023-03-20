package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        int answerHumen;
        String commandHuman;
        double answerEat;

        Bird bird = new Bird("Джек-Воробей", 35, "Загорелый", 79.6, 1.87, 0.5, 0.3);
        Cat cat = new Cat("Пушок", 12, "Бэлый-бэлый", 2.1, 0.3, 0.2, 0.6);
        Dog dog = new Dog("Тузик", 8, "Рыжевато-белый", 20.7, 0.8, 0.4, 1.6);
        Shark shark = new Shark("Куся", 50, "Бледно-серый", 564.3, 1.5, 1.3, 5.8);
        Human human = new Human("Александр", 28, "Белый", 73.5, 1.83, 0.5, 0.3);

        // =====================================================================================================
        System.out.printf("Сказать команду животному %s: ", dog.getName());
        commandHuman = scanner.nextLine();
        System.out.println(dog.voice(commandHuman));
        // =====================================================================================================
        System.out.printf("Сказать команду животному %s: ", cat.getName());
        commandHuman = scanner.nextLine();
        System.out.println(cat.voice(commandHuman));
        // =====================================================================================================
        System.out.printf("Сказать команду животному %s: ", bird.getName());
        commandHuman = scanner.nextLine();
        System.out.println(bird.voice(commandHuman));
        // =====================================================================================================
        System.out.printf("Сказать команду животному %s: ", human.getName());
        commandHuman = scanner.nextLine();
        System.out.println(human.voice(commandHuman));
        // =====================================================================================================

        // =====================================================================================================
        System.out.printf("Покормить животное: %s \n1 - Да\n2 - Нет\n", dog.getName());
        answerHumen = scanner.nextInt();

        if (answerHumen == 1) {
            System.out.println("Сколько дать еды: ");
            answerEat = scanner.nextDouble();

            System.out.println(dog.getInfo());
            dog.eat(answerEat);
            System.out.println(dog.getInfo());

        } else if (answerHumen == 2) {
            System.out.println("Жадина =(");
        }
        // =====================================================================================================
        System.out.printf("Покормить животное: %s \n1 - Да\n2 - Нет\n", cat.getName());
        answerHumen = scanner.nextInt();

        if (answerHumen == 1) {
            System.out.println("Сколько дать еды: ");
            answerEat = scanner.nextDouble();

            System.out.println(cat.getInfo());
            cat.eat(answerEat);
            System.out.println(cat.getInfo());

        } else if (answerHumen == 2) {
            System.out.println("Жадина =(");
        }
        // =====================================================================================================
        System.out.printf("Покормить животное: %s \n1 - Да\n2 - Нет\n", bird.getName());
        answerHumen = scanner.nextInt();

        if (answerHumen == 1) {
            System.out.println("Сколько дать еды: ");
            answerEat = scanner.nextDouble();

            System.out.println(bird.getInfo());
            bird.eat(answerEat);
            System.out.println(bird.getInfo());

        } else if (answerHumen == 2) {
            System.out.println("Жадина =(");
        }
        // =====================================================================================================
        System.out.printf("Покормить животное: %s \n1 - Да\n2 - Нет\n", shark.getName());
        answerHumen = scanner.nextInt();

        if (answerHumen == 1) {
            System.out.println(shark.getInfo());
            System.out.println(human.getInfo());

            shark.eat(human.getWeight());

            human.setWeight(0);
            human.setHeight(0);
            human.setWidth(0);
            human.setLength(0);

            System.out.println(shark.getInfo());
            System.out.println(human.getInfo());

        } else if (answerHumen == 2) {
            System.out.println("Жадина =(");
        }

        scanner.close();
    }
}
