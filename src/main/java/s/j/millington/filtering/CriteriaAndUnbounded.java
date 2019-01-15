package s.j.millington.filtering;

import java.util.ArrayList;
import java.util.List;

public class CriteriaAndUnbounded<T> implements Criteria<T> {

  private List<Criteria> criteria;

  public CriteriaAndUnbounded(List<Criteria> criteria) {
    this.criteria = criteria;
  }

  @Override
  public List<T> meetCriteria(List<T> list) {

    List<T> successful = new ArrayList<>(list);
    List<T> buffer;

    for(Criteria c : criteria){
      buffer = c.meetCriteria(successful);
      successful = new ArrayList<>(buffer);
      buffer.clear();
    }

    return successful;
  }
}
