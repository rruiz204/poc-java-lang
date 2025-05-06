package src.basics;

public class Loops {
  public static void execute() {
    System.out.println("=== Loops ===");

    int index = 0;

    while (index <= 5) {
      System.out.println(index);
      index++;
    }

    for (index = 0; index <= 5; index++) {
      System.out.println(index);
    }
  }
}
