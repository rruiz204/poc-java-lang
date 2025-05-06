import src.basics.Conditions;
import src.basics.Loops;
import src.basics.Variables;
import src.objects.Robot;

public class Main {
  public static void main(String[] args) {
    Loops.execute();
    Variables.execute();
    Conditions.execute();

    Robot machete = new Robot("Machete");
    machete.Display();
  }
}