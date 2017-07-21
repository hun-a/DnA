package sort.bubble;

import template.Algorithms;

import java.util.List;

import static util.AlgorithmUtil.*;

public class Bubble implements Algorithms {
  List<Integer> list;
  public static void main(String ... args) {
    
  }

  @Override
  public void init() {
    list = generateInitialList(() -> (int)((Math.random() * 100) + 1), 10);
  }

  @Override
  public void implement() {

  }
}
