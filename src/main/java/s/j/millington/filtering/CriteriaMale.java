package s.j.millington.filtering;

import s.j.millington.common.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria<Person> {
  @Override
  public List<Person> meetCriteria(List<Person> list) {
    List<Person> malePersons = new ArrayList<>();

    for(Person person : list){
      if(person.getGender().equalsIgnoreCase("MALE")){
        malePersons.add(person);
      }
    }

    return malePersons;
  }
}
