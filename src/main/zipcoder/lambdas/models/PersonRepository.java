package zipcoder.lambdas.models;

import zipcoder.lambdas.interfaces.*;


import java.util.*;

public class PersonRepository {

    private final List<Person> personList;

    public PersonRepository() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return this.personList;
    }

    public List<String> printPersons(CheckPerson tester) {
        List<String> output = new ArrayList<>();
        for (Person p : this.personList) {
            if (tester.test(p)) {
                output.add(p.printPerson());
            }
        }
        return output;
    }
}
