package main.algorithms.recursion.factorial;

/**
 * Created by hun on 06/08/17.
 */
public class Factorial {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
