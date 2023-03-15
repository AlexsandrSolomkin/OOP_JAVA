package DZ_OOP_JAVA.DZ_SEMINAR_1_2;

public class Person {

    public void openDoor(Locker locker) {
        if (!locker.getStatus()) {
            locker.setStatus(true);
            System.out.println("Открыт");
        } else {
            locker.setStatus(false);
            System.out.println("Закрыт");
        }
    }
}