package main.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
  private List<T> stack = new ArrayList<>();
  private int position = 0;
  private int max;

  public Stack(int max) {
    this.max = max;
  }

  public T pop() {
    return null;
  }

  public void push(T t) {

  }

  public T peek() {
    return null;
  }

  private boolean isEmpty() {
    return stack.isEmpty();
  }

  private  boolean isFull() {
    return position + 1 == max;
  }
}
