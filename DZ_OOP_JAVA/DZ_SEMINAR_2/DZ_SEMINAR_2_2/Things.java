package DZ_OOP_JAVA.DZ_SEMINAR_2.DZ_SEMINAR_2_2;
/**
 * Абстрактный класс для вещей
 */
public abstract class Things {
    private String name;
    private int purity;
    private int sizeClothes;
/**
 * Данные о вещи:
 * @param name - название
 * @param purity - чистота
 * @param sizeClothes - занимает места
 */
    public Things(String name, int purity, int sizeClothes) {
        this.name = name;
        this.purity = purity;
        this.sizeClothes = sizeClothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    public int getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(int sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

}
