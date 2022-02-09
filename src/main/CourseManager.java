package main;

public class CourseManager {
  public void editCourseInformation(String courseID, String courseName, int credits, int quarter) {
    Course newData = new Course(courseID, courseName, credits, quarter);
    Database.courses.replace(courseID, newData);
  }

  public void editCourseStatus(String courseID, boolean isPublic) {
    Course newData = Database.courses.get(courseID);
    newData.isPublic = isPublic;
    Database.courses.replace(courseID, newData);
  }
}
