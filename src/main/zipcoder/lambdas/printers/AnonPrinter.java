package zipcoder.lambdas.printers;

import zipcoder.lambdas.interfaces.*;
import zipcoder.lambdas.models.*;


import java.util.*;

public class AnonPrinter {
    public static List<String> printRepo(List<Person> peopleToPrint) {
        PersonRepository repo = new PersonRepository();
        repo.getPersonList().addAll(peopleToPrint);
        return repo.printPersons(new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge() > 5;
            }
        });
    }
}
