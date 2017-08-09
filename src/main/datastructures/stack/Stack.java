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

  public T pop() throws StackUnderFlow {
    if (isEmpty()) {
      throw new StackUnderFlow();
    } else {
      return stack.remove(--position);
    }
  }

  public void push(T t) throws StackOverFlow {
    if (isFull()) {
      throw new StackOverFlow();
    } else {
      stack.add(t);
      position++;
    }
  }

  public T peek() throws StackUnderFlow {
    if (isEmpty()) {
      throw new StackUnderFlow();
    }
    return stack.get(--position);
  }

  private boolean isEmpty() {
    return stack.isEmpty();
  }

  private boolean isFull() {
    return stack.size() == max;
  }
}