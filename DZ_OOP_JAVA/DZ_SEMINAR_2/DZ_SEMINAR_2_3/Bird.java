package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_3;

public class Bird extends Animal implements Say {

    public Bird(String name, int age, String color, double weight, double height, double width, double length) {
        super(name, age, color, weight, height, width, length);
    }

    @Override
    public double eat(double food) {
        this.weight += food;
        return this.weight;
    }

    @Override
    public String voice(String command) {
        if (command.equals("Голос")){
            return String.format("Я требую парле, парли ... Парламентераааа!!!");
        }

        return String.format("Я вас не понимаю");
    }

}