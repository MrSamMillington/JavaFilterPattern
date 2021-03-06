package s.j.millington.filtering;

import java.util.List;

public class CriteriaAnd<T> implements Criteria<T> {

  private Criteria criteria;
  private Criteria otherCriteria;

  public CriteriaAnd(Criteria criteria, Criteria otherCriteria) {
    this.criteria = criteria;
    this.otherCriteria = otherCriteria;
  }

  @Override
  public List<T> meetCriteria(List<T> list) {
    List<T> firstCriteriaList = criteria.meetCriteria(list);
    return otherCriteria.meetCriteria(firstCriteriaList);
  }
}
