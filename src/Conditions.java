package src;

public class Conditions {
  public static void main(String[] args) {
    int random = 198;

    if (random % 2 == 0) {
      System.out.println("even number");
    } else {
      System.out.println("odd number");
    }

    String text = (random % 2 != 0) ? "yes" : "not";
    System.out.println(text);
  }
}
