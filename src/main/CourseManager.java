package main;

public class CourseManager {
  public static void editCourseInformation(String courseID, String courseName, int credits, int quarter) {
    Course newData = new Course(courseID, courseName, credits, quarter);
    Database.courses.replace(courseID, newData);
  }

  public static void editCourseStatus(String courseID, boolean isPublic) {
    Course newData = Database.courses.get(courseID);
    newData.isPublic = isPublic;
    Database.courses.replace(courseID, newData);
  }

  public static void editLecture(String courseID, int lectureID, String lectureName, String date, String type) {
    // 良くない実装……。
    for (Lecture v : Database.lectures) {
      if (v.courseID.equals(courseID) && v.lectureID == lectureID) {
        v.lectureName = lectureName;
        v.date = date;
        v.type = type;
      }
    }
  }
}
