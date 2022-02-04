package main;

public class Teacher extends User {
  public int grade;
  public String belongs;

  public Teacher(int userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
  }
}
