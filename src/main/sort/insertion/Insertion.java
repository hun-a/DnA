package main.sort.insertion;

import main.template.Algorithms;

import java.util.function.BiPredicate;

/**
 * Created by hun on 25/07/2017.
 */
public class Insertion<T> implements Algorithms<T> {
  @Override
  public <T> void implement(T[] arr, BiPredicate<T, T> predicate) {
    insertionSort(arr, predicate);
  }

  private <T> void insertionSort(T[] arr, BiPredicate<T, T> predicate) {
    int length = arr.length;
    for (int i = 1; i < length; i++) {
      for (int j = i, compareIndex = (i - 1); j > 0; j--, compareIndex--) {
        if (!predicate.test(arr[compareIndex], arr[j])) {
          break;
        } else {
          T temp = arr[compareIndex];
          arr[compareIndex] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
