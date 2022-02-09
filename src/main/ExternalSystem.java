package main;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ExternalSystem {
  private ArrayList observers = new ArrayList();

  public void addObserver(ExternalSystemObserver observer) {
    observers.add(observer);
  }

  public void deleteObserver(ExternalSystemObserver observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    Iterator iterator = observers.iterator();
    while (iterator.hasNext()) {
      ExternalSystemObserver observer = (ExternalSystemObserver) iterator.next();
      observer.update(this);
    }
  }
}
