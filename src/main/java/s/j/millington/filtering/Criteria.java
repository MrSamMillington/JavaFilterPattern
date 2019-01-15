package s.j.millington.filtering;

import java.util.List;

public interface Criteria<T> {

  public List<T> meetCriteria(List<T> list);
}
