package s.j.millington.filtering;

import org.junit.Before;
import org.junit.Test;
import s.j.millington.common.Person;
import s.j.millington.predicates.PersonPredicates;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CriteriaTest {

  private Person person1 = new Person("Mike", "Male", Person.MaritalStatus.Married);
  private Person person2 = new Person("Sally", "Female", Person.MaritalStatus.Single);
  private Person person3 = new Person("Steve", "Male", Person.MaritalStatus.Single);
  private Person person4 = new Person("J", "Female", Person.MaritalStatus.Married);
  private Person person5 = new Person("H", "Male", Person.MaritalStatus.Married);
  private Person person6 = new Person("D", "Female", Person.MaritalStatus.Single);

  private PredicateCriteria predicateCriteria;
  private PredicateCriteria criteriaMarried;
  private CriteriaAndUnbounded criteriaAndUnbounded;

  private List<Person> allPersons;

  @Before
  public void setUp() throws Exception {
    predicateCriteria = new PredicateCriteria<Person>(PersonPredicates.isMalePredicate());
    criteriaMarried = new PredicateCriteria<Person>(PersonPredicates.isMarriedPredicate());

    criteriaAndUnbounded = new CriteriaAndUnbounded(Arrays.asList(PersonPredicates.isMalePredicate(), PersonPredicates.isMarriedPredicate()));

    allPersons = Arrays.asList(person1,
        person2,
        person3,
        person4,
        person5,
        person6);

  }
  
  @Test
  public void given3Males_whenMaleCriteriaCalled_check3MalesReturned() {

    List<Person> allMales = predicateCriteria.meetCriteria(allPersons);

    assertEquals(3L, allMales.size());

  }

  @Test
  public void givenAllPersons_whenUnboundedListOfCriteriaMaleAndMarried_check2Returned() {

    List<Person> marriedMales = criteriaAndUnbounded.meetCriteria(allPersons);

    assertEquals(2L, marriedMales.size());
  }
}