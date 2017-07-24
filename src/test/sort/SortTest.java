package test.sort;

import main.template.Algorithms;
import org.junit.*;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.sort.bubble.Bubble;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by hun on 24/07/2017.
 */
public class SortTest {
  final Integer[] arr = {92, 57, 1, 78, 5, 9, 48, 22};

  @Test
  public void bubbleAscTest() {
    Algorithms<Integer> bubble = new Bubble<>();
    Integer[] result = Stream.of(arr).sorted().toArray(Integer[]::new);
    bubble.implement(arr, bubble::asc);

    IntStream.rangeClosed(0, arr.length - 1)
      .forEach((i) -> assertThat(arr[i], is(result[i])));
  }

  @Test
  public void bubbleDescTest() {
    Algorithms<Integer> bubble = new Bubble<>();
    Integer[] result = Stream.of(arr)
      .sorted(Comparator.comparing(Integer::intValue).reversed())
      .toArray(Integer[]::new);
    bubble.implement(arr, bubble::desc);

    IntStream.rangeClosed(0, arr.length - 1)
      .forEach((i) -> assertThat(arr[i], is(result[i])));
  }
}
