package main;

import java.util.HashMap;
import java.util.Map;

public class Course {
  public String courseID;
  public String courseName;
  public int credits;
  public int quarter;
  public boolean isPublic;
  public Lecture[] lectures;
  public Map<String, CourseStudent> courseStudents = new HashMap<>();
  public Map<String, CourseTeacher> courseTeachers = new HashMap<>();

  public Course(String courseID, String courseName, int credits, int quarter) {
    this.courseID = courseID;
    this.courseName = courseName;
    this.credits = credits;
    this.quarter = quarter;
    this.isPublic = false;
    this.lectures = new Lecture[14];
    for (int i = 0; i < 14; i++) {
      // Lecture lec = new Lecture(i + 1, "第" + (i + 1) + "回講義", "2022/01/01");
      Exercise exe = new Exercise(i + 1, "第" + (i + 1) + "回講義", "2022/01/01");
      this.lectures[i] = exe;
    }
    MainSystem.courses.put(this.courseID, this);
    // デバッグ用
    System.out.println("New Course " + this.courseName + "(" + this.courseID + ") was created!");
  }
}
