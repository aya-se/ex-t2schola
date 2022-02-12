package main;

public class Student extends User implements DatabaseObserver {
  public int grade;
  public String belongs;

  public Student(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    Database.students.put(this.userID, this);
    Database.addObserver(this);
    // デバッグ用
    System.out.println("New Student " + this.userName + " was created!");
  }

  public void getCourses() {
    System.out.println(this.userName + "(" + this.userID + ")の受講講義一覧");
    for (CourseStudent v : Database.courseStudents) {
      if (v.userID.equals(this.userID)) {
        // Course cou = Database.courses.get(v.courseID);
        System.out.println("- " + v.courseID);
      }
    }
  }

  public void getStudentInfo() {
    System.out.println(this.userName + "(" + this.userID + ")の生徒情報");
    System.out.println("学年 : " + this.grade);
    System.out.println("所属 : " + this.belongs);
  }

  public void editStudentInfo(String userID, String userName, int grade, String belongs) {
    Student newData = new Student(userID, userName, grade, belongs);
    Database.students.replace(userID, newData);
  }

  public void attendCource(String courseID) {
    CourseStudent newData = new CourseStudent(this.userID, courseID);
    // デバッグ用
    System.out.println(this.userName + " attended the course " + courseID + ".");
  }

  public void update() {
    Student newData = Database.students.get(this.userID);
    this.userName = newData.userName;
    this.grade = newData.grade;
    this.belongs = newData.belongs;
  }
}
