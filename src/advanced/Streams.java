package src.advanced;

import java.util.Arrays;
import java.util.List;

public class Streams {
  public static void execute() {
    System.out.println("=== Stream ===");

    List<String> games = Arrays.asList("Hades", "Ori", "Celeste", "Isaac");

    games.stream()
      .filter(g -> g.startsWith("H") || g.startsWith("O"))
      .forEach(System.out::println);
  }
}
