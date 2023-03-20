package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_3;

/**
 * Интерфейс нам нужен для вынесения определенных методов и свойств, 
 * характерных для, например определенного класса, которые мы не можем
 * положить в абстрактный класс.
 */
public interface Say extends Eatable {
    public String voice(String text);
}
