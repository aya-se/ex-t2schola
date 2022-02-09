package main;

public class Lecture {
  public String courseID;
  public int lectureID;
  public String lectureName;
  public String date;
  public String type;

  public Lecture(String courseID, int lectureID, String lectureName, String date, String type) {
    this.courseID = courseID;
    this.lectureID = lectureID;
    this.lectureName = lectureName;
    this.date = date;
    this.type = type;
    Database.lectures.add(this);
  }
}
