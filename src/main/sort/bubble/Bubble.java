package main.sort.bubble;

import main.template.Algorithms;

import java.util.function.BiPredicate;

public class Bubble<T> implements Algorithms {

  @Override
  public <T> void implement(T[] arr, BiPredicate<T, T> predicate) {
    bubbleSort(arr, predicate);
  }

  @Override
  public <T> T[] init() {
    return (T[])(new String[]{"Z", "E", "A", "H", "W", "G", "B"});
  }

  private <T> T[] bubbleSort(T[] arr, BiPredicate<T, T> test) {
    int listLength = arr.length;
    int boundary = listLength - 1;

    for (int i = 0; i < listLength; i++) {
      for (int j = 0; j < boundary - i; j++) {
        if (test.test(arr[j], arr[j + 1])) {
          T temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
}
