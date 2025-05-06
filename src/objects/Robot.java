package src.objects;

public class Robot {
  public String name;
  public final String OS = "Linux";

  public Robot(String name) {
    this.name = name;
  }

  public void Display() {
    System.out.println(this.name);
    System.out.println(this.OS);
  }
}
