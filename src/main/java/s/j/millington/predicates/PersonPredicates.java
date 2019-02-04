package s.j.millington.predicates;

import s.j.millington.common.Person;

import java.util.function.Predicate;

public class PersonPredicates {

    public static Predicate<Person> isMalePredicate(){
        return person -> person.getGender().equals("Male");
    }

    public static Predicate<Person> isMarriedPredicate(){
        return person -> person.getMaritalStatus() == Person.MaritalStatus.Married;
    }


}
