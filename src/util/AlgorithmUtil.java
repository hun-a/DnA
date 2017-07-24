package util;

import template.Algorithms;

import java.util.stream.Stream;


/**
* Created by hun on 21/07/2017.
*/
public class AlgorithmUtil {

  public static <T> void print(T t, String comment) {
    System.out.print(comment + ": ");
    Stream.of(t).forEach(e -> System.out.print(e + "\t"));
    System.out.println();
  }

  public static <T> void measure(Algorithms algorithm) {
    long fastest = Long.MAX_VALUE;
    T[] arr = algorithm.init();
    for (int i = 0; i < 10; i++) {
      long start = System.nanoTime();
      algorithm.implement(arr, algorithm::asc);
      long duration = (System.nanoTime() - start) / 1_000_000;
      if (duration < fastest) {
        fastest = duration;
      }
    }
    System.out.println("elapsed time: " + fastest + " msecs");
  }
}
