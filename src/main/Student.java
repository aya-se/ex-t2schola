package main;

public class Student extends User {
  public int grade;
  public String belongs;

  public Student(int userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
  }
}
