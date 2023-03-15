package DZ_OOP_JAVA.DZ_SEMINAR_1_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Locker locker = new Locker();

        person.openDoor(locker);
        person.openDoor(locker);
        person.openDoor(locker);
        person.openDoor(locker);
    }
}
