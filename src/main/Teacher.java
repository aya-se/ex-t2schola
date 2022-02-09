package main;

public class Teacher extends User implements DatabaseObserver {
  public int grade;
  public String belongs;

  public Teacher(String userID, String userName, int grade, String belongs) {
    super(userID, userName);
    this.grade = grade;
    this.belongs = belongs;
    Database.teachers.put(this.userID, this);
    // デバッグ用
    System.out.println("New Teacher " + this.userName + " was created!");
  }

  public void getCourses() {
    System.out.println(this.userName + "(" + this.userID + ")の担当講義一覧");
    for (CourseTeacher v : Database.courseTeachers) {
      if (v.userID.equals(this.userID)) {
        // Course cou = Database.courses.get(v.courseID);
        System.out.println("- " + v.courseID);
      }
    }
  }

  public void handleCource(String courseID) {
    CourseTeacher newData = new CourseTeacher(this.userID, courseID);
    // デバッグ用
    System.out.println(this.userName + " handled the course " + courseID + ".");
  }

  public void editTeacherInfo(String userID, String userName, int grade, String belongs) {
    Teacher newData = new Teacher(userID, userName, grade, belongs);
    Database.teachers.replace(userID, newData);
  }

  public void update() {
    Teacher newData = Database.teachers.get(this.userID);
    this.userName = newData.userName;
    this.grade = newData.grade;
    this.belongs = newData.belongs;
  }
}
