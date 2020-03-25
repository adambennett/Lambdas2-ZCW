package zipcoder.lambdas.printers;

import zipcoder.lambdas.interfaces.*;
import zipcoder.lambdas.models.*;


import java.util.*;

public class LambdaPrinter {

    private static CheckPerson tester;

    static { tester = (p) -> p.getAge() > 5; }

    public static void setTester(CheckPerson newTestLogic) { tester = newTestLogic; }

    public static List<String> printRepo(List<Person> peopleToPrint) {
        PersonRepository repo = new PersonRepository();
        repo.getPersonList().addAll(peopleToPrint);
        return repo.printPersons(tester);
    }
}
