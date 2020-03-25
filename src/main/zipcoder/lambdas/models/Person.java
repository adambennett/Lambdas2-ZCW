package zipcoder.lambdas.models;

import java.time.*;
import java.util.*;

public class Person {

    public enum Sex { MALE, FEMALE }

    private final String name;
    private final LocalDate birthday;
    private final Sex gender;
    private final String emailAddress;

    public Person(String name, Sex gender, String email) { this(name, LocalDate.now(), gender, email); }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        LocalDate curr = LocalDate.now();
        return curr.compareTo(this.birthday);
    }

    public Sex getGender() {
        return gender;
    }

    public String printPerson() {
        return this.toString();
    }


    @Override
    public String toString() {
        return
                "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
