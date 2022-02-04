package main;

public abstract class User {
  public int userID;
  public String userName;

  protected User(int userID, String userName) {
    this.userID = userID;
    this.userName = userName;
  }
}
