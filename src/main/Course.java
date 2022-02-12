package main;

public class Course implements DatabaseObserver {
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
    Database.courses.put(courseID, this);
    Database.addObserver(this);
    // デフォルトで各講義を追加
    for (int i = 1; i <= 14; i++) {
      Lecture newData = new Lecture(courseID, i, "新しい講義", "2022-01-01", "授業");
    }

  }

  public void getCourseStudents() {
    System.out.println(this.courseName + "(" + this.courseID + ")の受講生一覧");
    for (CourseStudent v : Database.courseStudents) {
      if (v.courseID.equals(this.courseID))
        System.out.println("- " + v.userID);
    }
  }

  public void getCourseTeachers() {
    System.out.println(this.courseName + "(" + this.courseID + ")の担当教員一覧");
    for (CourseTeacher v : Database.courseTeachers) {
      if (v.courseID.equals(this.courseID))
        System.out.println("- " + v.userID);
    }
  }

  public void getCourseInfo() {
    System.out.println(this.courseName + "(" + this.courseID + ")の講義情報");
    System.out.println("単位数 : " + this.credits);
    System.out.println("開講時期 : " + this.quarter + "Q");
    System.out.println("公開時期 : " + this.isPublic);
  }

  public void getCourseLectures() {
    System.out.println(this.courseName + "(" + this.courseID + ")の各講義");
    for (Lecture v : Database.lectures) {
      if (v.courseID.equals(this.courseID))
        System.out.println("- 第" + v.lectureID + "回 (" + v.date + "): " + v.lectureName + "(" + v.type + ")");
    }
  }

  public void update() {
    Course newData = Database.courses.get(this.courseID);
    this.courseName = newData.courseName;
    this.credits = newData.credits;
    this.quarter = newData.quarter;
    this.isPublic = newData.isPublic;
  }
}
