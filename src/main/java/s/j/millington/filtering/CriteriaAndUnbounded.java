package s.j.millington.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CriteriaAndUnbounded<T> implements Criteria<T> {

  private List<Predicate<T>> criteria;

  public CriteriaAndUnbounded(List<Predicate<T>> criteria) {
    this.criteria = criteria;
  }

  @Override
  public List<T> meetCriteria(List<T> list) {

    Predicate<T> andPredicate = criteria.stream().reduce(Predicate::and).orElse(x->true);

    return list.stream().filter(andPredicate).collect(Collectors.toList());

  }
}
