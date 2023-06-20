package kadu.studies;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;




public class PersonTest
{

    @Test
    public void validateAgeCalculation()
    {
        Person person = new Person("Skadudle", LocalDate.of(1990, 10, 27));
        Assertions.assertEquals(32, person.getAge());
    }
}
