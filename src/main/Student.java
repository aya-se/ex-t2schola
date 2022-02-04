package main;

public class Student extends User {
  public int grade;
  public String belongs;

  public Student(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    // デバッグ用
    System.out.println("New Student " + this.userName + " was created!");
  }

  public void attendCource(String courseID) {
    CourseStudent cs = new CourseStudent(this.userID, courseID);
    // デバッグ用
    System.out.println(this.userName + " attended the course " + courseID + ".");
  }
}
