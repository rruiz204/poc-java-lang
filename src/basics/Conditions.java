package src.basics;

public class Conditions {
  public static void execute() {
    System.out.println("=== Conditions ====");

    if (10 > 5) {
      System.out.println("expression true");
    } else {
      System.out.println("expression false");
    }

    boolean maybe = (10 > 7) ? true : false;
  }
}
