package src.advanced;

public class Exceptions {
  public static void execute() {
    System.out.println("=== Exceptions ===");

    try {
      throw new Exception("exception example");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}