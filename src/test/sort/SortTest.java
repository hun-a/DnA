package test.sort;

import org.junit.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.sort.bubble.Bubble;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by hun on 24/07/2017.
 */
public class SortTest {

  @Test
  public void bubbleTest() {
    final Integer[] arr = {92, 57, 1, 78, 5, 9, 48, 22};
    final Integer[] resultArr;

    Bubble<Integer> bubble = new Bubble<>();
    bubble.implement(arr, bubble::asc);
    resultArr = Stream.of(arr).sorted().toArray(Integer[]::new);
    bubble.implement(arr, bubble::asc);

    IntStream.rangeClosed(0, arr.length - 1)
      .forEach((i) -> assertThat(arr[i], is(resultArr[i])));
  }
}
