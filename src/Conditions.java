package src;

public class Conditions {
  public static void main(String[] args) {
    int random = 198;

    if (random % 2 == 0) {
      System.out.println("even number");
    } else {
      System.out.println("odd number");
    }

    String type = (random % 2 != 0) ? "even" : "odd";
    System.out.println(type);
  }
}
