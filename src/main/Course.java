package main;

public class Course {
  public String courseID;
  public String courseName;
  public int credits;
  public int quarter;
  public boolean isPublic;

  public Course(String courseID, String courseName, int credits, int quarter) {
    this.courseID = courseID;
    this.courseName = courseName;
    this.credits = credits;
    this.quarter = quarter;
    this.isPublic = false;
    // デバッグ用
    System.out.println("New Course " + this.courseName + "(" + this.courseID + ") was created!");
  }
}
