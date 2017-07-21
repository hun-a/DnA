package sort.bubble;

import template.Algorithms;

import java.util.List;

import static util.AlgorithmUtil.*;

public class Bubble implements Algorithms {
  List<Integer> list;
  Integer[] arr;
  public static void main(String ... args) {
    Bubble bubble = new Bubble();
    measure(bubble);
  }

  @Override
  public void init() {
    int limit = 10_000;
    list = generateInitialList(() -> (int)((Math.random() * limit * 100) + 1), limit);
    arr = new Integer[list.size()];
    list.toArray(arr);
  }

  @Override
  public void implement() {
    int listLength = arr.length;
    int boundary = listLength - 1;

    for (int i = 0; i < listLength; i++) {
      for (int j = 0; j < boundary - i; j++) {
        if (arr[j] > arr[j + 1]) {
          Integer temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
