package main;

public abstract class User {
  public String userID;
  public String userName;

  protected User(String userID, String userName) {
    this.userID = userID;
    this.userName = userName;
    MainSystem.users.put(this.userID, this);
  }
}
