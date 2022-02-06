package main;

import java.util.HashMap;
import java.util.Map;

public class Student extends User implements ExternalSystemObserver {
  public int grade;
  public String belongs;
  public Map<String, CourseStudent> courses = new HashMap<>();

  public Student(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    // デバッグ用
    System.out.println("New Student " + this.userName + " was created!");
  }

  public void attendCource(String courseID) {
    Course cou = MainSystem.courses.get(courseID);
    CourseStudent cs = new CourseStudent(this.userID, courseID);
    this.courses.put(courseID, cs);
    cou.courseStudents.put(userID, cs);
    // デバッグ用
    System.out.println(this.userName + " attended the course " + courseID + ".");
  }

  public void update(ExternalSystem subject) {
    // hoge
  }
}
