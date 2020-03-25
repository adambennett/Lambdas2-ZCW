package zipcoder.lambdas.interfaces;

import zipcoder.lambdas.models.*;


@FunctionalInterface
public interface CheckPerson {
    boolean test(Person p);
}
