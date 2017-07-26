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

  }
}
