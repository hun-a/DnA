package test.sort;

import main.sort.insertion.Insertion;
import main.sort.selection.Selection;
import main.template.Algorithms;
import org.junit.*;

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
    boolean result = TestUtil.testRunner(arr, bubble, bubble::asc);
    assertThat(result, is(equalTo(true)));
  }

  @Test
  public void bubbleDescTest() {
    Algorithms<Integer> bubble = new Bubble<>();
    boolean result = TestUtil.testRunner(arr, bubble, bubble::desc);
    assertThat(result, is(equalTo(true)));
  }

  @Test
  public void insertionAscTest() {
    Algorithms<Integer> insertion = new Insertion<>();
    boolean result = TestUtil.testRunner(arr, insertion, insertion::asc);
    assertThat(result, is(equalTo(true)));
  }

  @Test
  public void insertionDescTest() {
    Algorithms<Integer> insertion = new Insertion<>();
    boolean result = TestUtil.testRunner(arr, insertion, insertion::desc);
    assertThat(result, is(equalTo(true)));
  }

  @Test
  public void selectionAscTest() {
    Algorithms<Integer> selection = new Selection<>();
    boolean result = TestUtil.testRunner(arr, selection, selection::asc);
    assertThat(result, is(equalTo(true)));
  }

  @Test
  public void selectionDescTest() {
    Algorithms<Integer> selection = new Selection<>();
    boolean result = TestUtil.testRunner(arr, selection, selection::desc);
    assertThat(result, is(equalTo(true)));
  }
}
