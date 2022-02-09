package main;

import java.util.HashMap;
import java.util.Map;

public class MainSystem implements ExternalSystemObserver {
  // 全体の講義・ユーザーを管理
  public static Map<String, Course> courses = new HashMap<>();
  public static Map<String, User> users = new HashMap<>();

  public void createUser() {
    // hoge
  }

  public void createCourse() {
    // hoge
  }

  public void loginUser(int userID) {
    // hoge
  }

  public void update(ExternalSystem subject) {
    // hoge
  }
}
