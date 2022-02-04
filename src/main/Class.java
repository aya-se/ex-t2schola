package main;

public class Class {
  public int classID;
  public String className;
  public int credits;
  public int quarter;
  public boolean isPublic;

  public Class(int classID, String className, int credits, int quarter) {
    this.classID = classID;
    this.className = className;
    this.credits = credits;
    this.quarter = quarter;
    this.isPublic = false;
  }
}
