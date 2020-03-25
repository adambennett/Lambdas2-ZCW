package zipcoder.lambdas.printers;

import org.junit.*;
import zipcoder.lambdas.models.*;

import java.time.*;
import java.util.*;

import static org.junit.Assert.*;

public class AnonPrinterTest {

    private static List<Person> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add(new Person("Adam", LocalDate.of(1993, Month.OCTOBER, 3), Person.Sex.MALE, "adamsemail@email.com"));
        list.add(new Person("Jeff", LocalDate.of(1994, Month.JANUARY, 4), Person.Sex.MALE, "jeffsemail@email.com"));
        list.add(new Person("Pete", LocalDate.of(1995, Month.FEBRUARY, 16), Person.Sex.MALE, "petesemail@email.com"));
        list.add(new Person("Tom", LocalDate.of(2020, Month.MARCH, 23), Person.Sex.MALE, "tomsemail@email.com"));
        list.add(new Person("Paul", LocalDate.of(1996, Month.APRIL, 13), Person.Sex.MALE, "paulsemail@email.com"));
        list.add(new Person("Mary", LocalDate.of(1997, Month.JUNE, 11), Person.Sex.FEMALE, "marysemail@email.com"));
        list.add(new Person("Alice", LocalDate.of(1998, Month.JULY, 7), Person.Sex.FEMALE, "alicesemail@email.com"));
        list.add(new Person("Rachel", LocalDate.of(1999, Month.AUGUST, 8), Person.Sex.FEMALE, "rachelsemail@email.com"));
        list.add(new Person("Jane", LocalDate.of(2020, Month.JANUARY, 12), Person.Sex.FEMALE, "janeemail@email.com"));
    }

    @Test
    public void printRepo() {
        List<String> defaultOutput = AnonPrinter.printRepo(list);
        Integer expectedDefaultSize = 7;
        Integer actualDefaultSize = defaultOutput.size();
        Assert.assertEquals(expectedDefaultSize, actualDefaultSize);
    }
}