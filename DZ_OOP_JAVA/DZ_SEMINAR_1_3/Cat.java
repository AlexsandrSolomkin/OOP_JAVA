package DZ_OOP_JAVA.DZ_SEMINAR_1_3;

import java.util.Random;

public class Cat {
    Random rnd = new Random();
    private String name;
    private boolean hungry;
    private boolean sleep;

    public Cat(String name, boolean hungry, boolean sleep) {
        this.name = name;
        this.hungry = hungry;
        this.sleep = sleep;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry = rnd.nextBoolean();
    }

    public boolean isSleep() {
        return sleep = rnd.nextBoolean();
    }

    public void setHungry() {
        this.hungry = true;
    }

    public void setSleep() {
        this.sleep = true;
    }

    public String voice() {
        return this.name + " мяу";
    }

    public String voiceBad() {
        return this.name + " фр-р-р!";
    }

    public String voiceSleep() {
        return "О-О-О-О-О-П-П-П-П-П";
    }

    public String noHungry() {
        return "Шик-шик!";
    }

    public String eatAll() {
        return "м-м-м-м";
    }
}