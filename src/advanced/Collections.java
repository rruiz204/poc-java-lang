package src.advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
  public static void execute() {
    System.out.println("=== Collections ===");

    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");

    System.out.println(fruits.get(1));

    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);

    Map<String, Integer> games = new HashMap<>();
    games.put("Hollow Knigh", 1600);
    games.put("Hades", 3000);
    games.put("Ori", 1000);
  }
}