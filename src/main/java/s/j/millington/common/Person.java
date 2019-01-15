package s.j.millington.common;

public class Person {

   private String name;
   private String gender;
   private MaritalStatus maritalStatus;

  public Person(String name, String gender, MaritalStatus maritalStatus) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public MaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public enum MaritalStatus{
     Single,
     Married
   }
}
