package main.sort.shell;

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

  }
}
