package main;

public class Teacher extends User {
  public int grade;
  public String belongs;

  public Teacher(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    // デバッグ用
    System.out.println("New Teacher " + this.userName + " was created!");
  }

  public void handleCource(String courseID) {
    CourseTeacher ct = new CourseTeacher(this.userID, courseID);
    // デバッグ用
    System.out.println(this.userName + " attended the course " + courseID + ".");
  }
}
