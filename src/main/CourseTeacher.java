package main;

public class CourseTeacher {
  public String userID;
  public String courseID;
  public CourseManager manager;

  public CourseTeacher(String userID, String courseID) {
    this.userID = userID;
    this.courseID = courseID;
  }
}
