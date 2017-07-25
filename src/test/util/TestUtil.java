package test.util;

import main.template.Algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

/**
 * Created by hun on 24/07/2017.
 */
public class TestUtil {
  private static <Integer> boolean isSame(Integer[] t1, Integer[] t2) {
    if (t1.length != t2.length) {
      return false;
    }
    return IntStream.rangeClosed(0, t1.length - 1)
      .allMatch(i -> t1[i] == t2[i]);
  }

  public static boolean testRunner(Integer[] arr,
                                   Algorithms<Integer> algorithm,
                                   BiPredicate<Integer, Integer> predicate) {
    Integer[] result = arr.clone();
    Comparator<Integer> comp = (i, j) -> {
      if (predicate.test(i, j)) {
        return 1;
      } else {
        return -1;
      }
    };
    Arrays.sort(result, comp);
    algorithm.implement(arr, predicate::test);
    return isSame(arr, result);
  }
}