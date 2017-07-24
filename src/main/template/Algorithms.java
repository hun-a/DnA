package main.template;

import java.util.function.BiPredicate;

/**
 * Created by hun on 21/07/2017.
 */
public interface Algorithms<T> {
  <T> void implement(T[] arr, BiPredicate<T, T> predicate);
  default <T> boolean asc(T t1, T t2) {
    return (t1.hashCode() - t2.hashCode() > 0) ? true : false;
  }
  default <T> boolean desc(T t1, T t2) {
    return (t1.hashCode() - t2.hashCode() < 0) ? true : false;
  }
 }
