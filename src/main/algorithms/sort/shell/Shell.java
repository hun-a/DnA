package main.algorithms.sort.shell;

import main.template.Algorithms;

import java.util.function.BiPredicate;

/**
 * Created by hun on 26/07/2017.
 */
public class Shell<T> implements Algorithms<T> {
  @Override
  public <T> void implement(T[] arr, BiPredicate<T, T> predicate) {
    shellSort(arr, predicate);
  }

  private <T> void shellSort(T[] arr, BiPredicate<T, T> predicate) {
    int gap = arr.length;
    do {
      gap = gap / 3 + 1;
      for (int i = 0; i < gap; i++) {
        for (int separatedArrayIndex = i + gap; separatedArrayIndex < arr.length; separatedArrayIndex += gap) {
          for (int insertionIndex = separatedArrayIndex; insertionIndex - gap >= 0; insertionIndex--) {
            if (!predicate.test(arr[insertionIndex - gap], arr[insertionIndex])) {
              break;
            } else {
              T temp = arr[insertionIndex - gap];
              arr[insertionIndex - gap] = arr[insertionIndex];
              arr[insertionIndex] = temp;
            }
          }
        }
      }
    } while (gap != 1);
  }
}
