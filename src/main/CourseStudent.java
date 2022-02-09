package main;

public class CourseStudent {
  public String userID;
  public String courseID;

  public CourseStudent(String userID, String courseID) {
    this.userID = userID;
    this.courseID = courseID;
    Database.courseStudents.add(this);
  }
}
