package main;

import java.util.HashMap;
import java.util.Map;

public class Teacher extends User implements ExternalSystemObserver {
  public int grade;
  public String belongs;
  public Map<String, CourseTeacher> courses = new HashMap<>();

  public Teacher(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    // デバッグ用
    System.out.println("New Teacher " + this.userName + " was created!");
  }

  public void handleCource(String courseID) {
    Course cou = MainSystem.courses.get(courseID);
    CourseTeacher ct = new CourseTeacher(this.userID, courseID);
    this.courses.put(courseID, ct);
    cou.courseTeachers.put(userID, ct);
    // デバッグ用
    System.out.println(this.userName + " handled the course " + courseID + ".");
  }

  public void update(ExternalSystem subject) {
    // hoge
  }
}
