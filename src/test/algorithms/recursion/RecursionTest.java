package test.algorithms.recursion;

import main.algorithms.recursion.factorial.Factorial;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by hun on 06/08/17.
 */
public class RecursionTest {

    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();

        int n = 10;
        int expect = 3628800;
        int result = factorial.factorial(n);

        assertThat(result, is(expect));
    }
}
