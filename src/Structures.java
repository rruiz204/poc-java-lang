package src;

import java.util.*;

public class Structures {
  public static void main(String[] args) {
    List<String> letters = new ArrayList<>();
    letters.add("a");
    letters.add("b");
    letters.add("c");
    System.out.println(letters);

    Map<String, Integer> fruits = new HashMap<>();
    fruits.put("watermelon", 150);
    fruits.put("orange", 100);
    fruits.put("kiwi", 75);
    System.out.println(fruits);

    Set<Integer> ids = new HashSet<>();
    ids.add(1);
    ids.add(2);
    ids.add(1);
    System.out.println(ids);
  }
}
