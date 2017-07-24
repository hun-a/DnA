package test.util;

import java.util.stream.IntStream;

/**
 * Created by hun on 24/07/2017.
 */
public class TestUtil {
  public static <T> boolean isSame(T[] t1, T[] t2) {
    if (t1.length != t2.length) {
      return false;
    }
    return IntStream.rangeClosed(0, t1.length - 1)
      .allMatch(i -> t1[i] == t2[i]);
  }
}