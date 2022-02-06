package main;

public abstract class CourseManager implements ExternalSystemObserver {
  protected CourseManager() {
    // hoge
  }

  public void editCourceInformation(String courseID) {
    // edit
  }

  public void update(ExternalSystem subject) {
    // hoge
  }
}
