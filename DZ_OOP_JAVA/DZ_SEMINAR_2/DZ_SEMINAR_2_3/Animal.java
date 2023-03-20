package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_3;

/**
 * Абстрактный класс для живых существ
 */
public abstract class Animal {
    private String name;
    private int age;
    private String color;
    protected double weight;
    private double height;
    private double width;
    private double length;

    /**
     * Задание конструктора с параметрами:
     * 
     * @param name   - имя
     * @param age    - возраст, лет
     * @param color  - окрас
     * @param weight - вес, кг
     * 
     *               Габаритный размер:
     * @param height - высота, м
     * @param width  - ширина, м
     * @param length - длина, м
     */
    public Animal(String name, int age, String color, double weight, double height, double width, double length) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getInfo() {
        return String.format("Name: %s\nAge: %d\nColor: %s\nWeight: %f\nHeight: %f\nWidth: %f\nLength: %f\n",
                this.name, this.age, this.color, this.weight, this.height, this.width, this.length);
    }
}
