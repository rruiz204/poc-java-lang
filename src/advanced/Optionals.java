package src.advanced;

import java.util.Optional;

public class Optionals {
  public static void execute() {
    System.out.println("=== Optionals ===");
    Optional<String> name = Optional.ofNullable("testing");
    name.ifPresent((n) -> System.out.println("Name: " + name.get()));
  }
}
