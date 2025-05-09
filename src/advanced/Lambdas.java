package src.advanced;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {
  public static void execute() {
    System.out.println("=== Lambdas ===");

    System.out.println("=== Consumer ===");
    Consumer<String> uppercase = (s) -> System.out.println(s.toUpperCase());
    uppercase.accept("hello world!!");

    System.out.println("=== Predicate ===");
    Predicate<Integer> isOdd = (number) -> number % 2 == 0;
    System.out.println("10 is odd? " + isOdd.test(10));

    System.out.println("=== Function ===");
    Function<String, Integer> len = (s) -> s.length();
    System.out.println("Lenght: " + len.apply("lambda"));

    System.out.println("=== Supplier ===");
    Supplier<Double> random = () -> Math.random() * 100;
    System.out.println("Random: " + random.get());
  }
}
