package main;

public class CourseInfoManager extends CourseManager {
  public CourseInfoManager() {
    super();
  }

  public void editCourseInformation(String courseID, String courseName, int credits, int quarter) {
    Course cou = MainSystem.courses.get(courseID);
    cou.courseName = courseName;
    cou.credits = credits;
    cou.quarter = quarter;
  }

  public void editCourseStatus(String courseID, boolean isPublic) {
    Course cou = MainSystem.courses.get(courseID);
    cou.isPublic = isPublic;
  }
}
