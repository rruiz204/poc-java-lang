package src;

import java.util.List;
import java.util.ArrayList;

public class Loops {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(124);
    numbers.add(135);
    numbers.add(199);
    numbers.add(100);

    for (Integer number : numbers) {
      System.out.println(number);
    }
  }
}
