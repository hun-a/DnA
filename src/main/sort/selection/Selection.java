package main.sort.selection;

import main.template.Algorithms;

import java.util.function.BiPredicate;

/**
 * Created by hun on 26/07/2017.
 */
public class Selection<T> implements Algorithms<T>{
  @Override
  public <T> void implement(T[] arr, BiPredicate<T, T> predicate) {
    selectionSort(arr, predicate);
  }

  private <T> void selectionSort(T[] arr, BiPredicate<T, T> predicate) {
    int length = arr.length;

    for (int i = 0; i < length - 1; i++) {
      int compareTargetIndex = i;
      for (int j = i + 1; j < length; j++) {
        if (predicate.test(arr[compareTargetIndex], arr[j])) {
          compareTargetIndex = j;
        }
      }
      if (predicate.test(arr[i], arr[compareTargetIndex])) {
        T temp = arr[i];
        arr[i] = arr[compareTargetIndex];
        arr[compareTargetIndex] = temp;
      }
    }
  }
}
