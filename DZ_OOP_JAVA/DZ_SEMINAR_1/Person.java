package DZ_OOP_JAVA.DZ_SEMINAR_1;

import java.time.LocalDate;

/**
 * Person
 */
public class Person {
    public String fullName;
    public LocalDate birthDay;
    public LocalDate deathDay;

    public Person(String fullName, LocalDate birthDay, LocalDate deathDay) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.deathDay = deathDay;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public LocalDate getDeathDay() {
        return deathDay;
    }

}