package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Database {
  // 全体のデータを全て管理
  public static Map<String, User> users = new HashMap<>();
  public static Map<String, Student> students = new HashMap<>();
  public static Map<String, Teacher> teachers = new HashMap<>();
  public static Map<String, Course> courses = new HashMap<>();
  public static ArrayList<Lecture> lectures = new ArrayList<>();
  public static ArrayList<CourseStudent> courseStudents = new ArrayList<>();
  public static ArrayList<CourseTeacher> courseTeachers = new ArrayList<>();
  // DatabaseObserver一覧
  private static ArrayList<DatabaseObserver> observers = new ArrayList<>();

  public static void addObserver(DatabaseObserver observer) {
    observers.add(observer);
  }

  public static void deleteObserver(DatabaseObserver observer) {
    observers.remove(observer);
  }

  public static void notifyObservers() {
    Iterator iterator = observers.iterator();
    while (iterator.hasNext()) {
      DatabaseObserver observer = (DatabaseObserver) iterator.next();
      observer.update();
      System.out.println("notifyObservers : " + observer.getClass());
    }
  }
}
