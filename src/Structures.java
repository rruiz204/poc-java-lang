package src;

import java.util.*;

public class Structures {
  public static void main(String[] args) {
    List<String> letters = new ArrayList<>();

    letters.add("a");
    letters.add("b");
    letters.add("c");

    letters.forEach(letter -> System.out.println(letter));


    Set<Integer> ids = new HashSet<>();

    ids.add(1);
    ids.add(2);
    ids.add(1);

    ids.forEach(id -> System.out.println(id));
  }
}
