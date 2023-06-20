package kadu.studies;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Hello world!
 *
 */
public class Person
{
    private String name;
    private LocalDate birth;

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public int getAge() {
        return  (int) ChronoUnit.YEARS.between(this.birth, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }
}
