package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_3;

import java.time.LocalDate;

/**
 * Абстрактный класс для живых существ
 */
public abstract class Animal {
    private String name;
    private LocalDate age;
    private String color;
    private double weight;
    private double height;
    private double width;
    private double length;

    /**
     * Задание конструктора с параметрами:
     * 
     * @param name   - имя
     * @param age    - возраст
     * @param color  - оттенок
     * @param weight - вес
     * 
     *               Габаритный размер:
     * @param height - высота
     * @param width  - ширина
     * @param length - длина
     */
    public Animal(String name, LocalDate age, String color, double weight, double height, double width, double length) {
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

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
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
}
