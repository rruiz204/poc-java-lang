package src.objects;

public record Seed(
  int Id,
  String Name
) {
  public void Display() {
    System.out.println(this.Id);
    System.out.println(this.Name);
  }
}