package s.j.millington.filtering;

import s.j.millington.common.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria<Person> {
  @Override
  public List<Person> meetCriteria(List<Person> list) {
    List<Person> marriedPersons = new ArrayList<>();

    for(Person p : list){
      if(p.getMaritalStatus() == Person.MaritalStatus.Married){
        marriedPersons.add(p);
      }
    }

    return marriedPersons;
  }
}
