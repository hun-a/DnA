package util;

import template.Algorithms;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
* Created by hun on 21/07/2017.
*/
public class AlgorithmUtil {
  public static <T> List<T> generateInitialList(Supplier<T> random, int limit) {
    return Stream.generate(random)
        .distinct()
        .limit(limit)
        .collect(toList());
  }

  public static <T> void print(T t, String comment) {
    System.out.print(comment + ": ");
    Stream.of(t).forEach(e -> System.out.print(e + "\t"));
    System.out.println();
  }

  public static <T> void measure(Algorithms algorithm) {
    long fastest = Long.MAX_VALUE;
    algorithm.init();

    for (int i = 0; i < 10; i++) {
      long start = System.nanoTime();
      algorithm.run();
      long duration = (System.nanoTime() - start) / 1_000_000;
      if (duration < fastest) {
        fastest = duration;
      }
    }
    System.out.println("elapsed time: " + fastest + " msecs");
  }
}
