package s.j.millington.filtering;

import java.util.List;

public class CriteriaOr<T> implements Criteria<T> {

  private Criteria criteria;
  private Criteria otherCriteria;

  public CriteriaOr(Criteria criteria, Criteria otherCriteria) {
    this.criteria = criteria;
    this.otherCriteria = otherCriteria;
  }

  @Override
  public List<T> meetCriteria(List<T> list) {
    List<T> firstCriteriaMet = criteria.meetCriteria(list);
    return otherCriteria.meetCriteria(firstCriteriaMet);
  }
}
