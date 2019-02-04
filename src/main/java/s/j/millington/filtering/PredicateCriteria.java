package s.j.millington.filtering;

import s.j.millington.common.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateCriteria<T> implements Criteria<T> {

  private final Predicate<T> predicate;

  public PredicateCriteria(Predicate<T> predicate) {
    this.predicate = predicate;
  }

  @Override
  public List<T> meetCriteria(List<T> list) {
    List<T> successes = new ArrayList<>();

    for(T type : list){
      if(predicate.test(type)){
        successes.add(type);
      }
    }

    return successes;
  }
}
