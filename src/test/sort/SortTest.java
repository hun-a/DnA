package test.sort;

import main.sort.insertion.Insertion;
import main.template.Algorithms;
import org.junit.*;

import java.util.Comparator;
import java.util.stream.Stream;

import main.sort.bubble.Bubble;
import test.util.TestUtil;

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

    boolean testResult = TestUtil.isSame(arr, result);
    assertThat(testResult, is(equalTo(true)));
  }

  @Test
  public void bubbleDescTest() {
    Algorithms<Integer> bubble = new Bubble<>();
    Integer[] result = Stream.of(arr)
      .sorted(Comparator.comparing(Integer::intValue).reversed())
      .toArray(Integer[]::new);
    bubble.implement(arr, bubble::desc);

    boolean testResult = TestUtil.isSame(arr, result);
    assertThat(testResult, is(equalTo(true)));
  }

  @Test
  public void insertionAscTest() {
    Algorithms<Integer> insertion = new Insertion<>();
    Integer[] result = Stream.of(arr).sorted().toArray(Integer[]::new);
    insertion.implement(arr, insertion::asc);

    boolean testResult = TestUtil.isSame(arr, result);
    assertThat(testResult, is(equalTo(true)));
  }

  @Test
  public void insertionDescTest() {
    Algorithms<Integer> insertion = new Insertion<>();
    Integer[] result = Stream.of(arr)
      .sorted(Comparator.comparing(Integer::intValue).reversed())
      .toArray(Integer[]::new);
    insertion.implement(arr, insertion::desc);

    boolean testResult = TestUtil.isSame(arr, result);
    assertThat(testResult, is(equalTo(true)));
  }
}
