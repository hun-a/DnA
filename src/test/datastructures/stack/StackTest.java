package test.datastructures.stack;

import main.datastructures.stack.Stack;
import main.datastructures.stack.StackOverFlow;
import main.datastructures.stack.StackUnderFlow;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by hun on 09/08/2017.
 */
public class StackTest {
  private static Stack<Integer> stack;

  @Before
  public void before() {
    stack = new Stack<>(10);
  }

  @Test
  public void pushTest() {
    IntStream.rangeClosed(1, 10).boxed().forEach(i -> {
        try {
          stack.push(i);
        } catch (StackOverFlow e) {
          e.printStackTrace();
        }
      }
    );
  }

  @Test(expected=StackOverFlow.class)
  public void overFlowTest() throws StackOverFlow {
    for (int i = 0; i <= 10; i++) {
      stack.push(i);
    }
  }

  @Test
  public void popTest() throws Exception {
    stack.push(100);
    assertThat(stack.pop(), is(100));
  }

  @Test(expected= StackUnderFlow.class)
  public void underFlowTest() throws StackUnderFlow {
    stack.pop();
  }

  @Test
  public void peekTest() throws StackOverFlow, StackUnderFlow {
    stack.push(100);
    assertThat(stack.peek(), is(100));
  }
}
