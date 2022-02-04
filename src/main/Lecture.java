package main;

public abstract class Lecture {
  public int lectureID;
  public String lectureName;
  public String date;

  protected Lecture(int lectureID, String lectureName, String date) {
    this.lectureID = lectureID;
    this.lectureName = lectureName;
    this.date = date;
  }
}
