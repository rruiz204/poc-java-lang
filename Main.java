import src.advanced.Exceptions;
import src.advanced.Lambdas;
import src.advanced.Optionals;
import src.basics.Conditions;
import src.basics.Loops;
import src.basics.Variables;
import src.objects.Day;
import src.objects.Planet;
import src.objects.Robot;
import src.objects.Seed;
import src.oop.SayHelloUseCase;
import src.oop.UseCase;

public class Main {
  public static void main(String[] args) {
    Loops.execute();
    Variables.execute();
    Conditions.execute();
    Exceptions.execute();
    Lambdas.execute();
    Optionals.execute();
    
    System.out.println("=== Classes ===");
    Robot machete = new Robot("Machete");
    machete.Display();


    System.out.println("=== Enums ===");
    Planet mercury = Planet.MERCURY;

    double result = mercury.surfaceGravity();
    System.out.println(result);

    Day day = Day.MONDAY;

    if (day == Day.FRIDAY) {
      System.out.println("today is friday!!!");
    } else {
      System.out.println("today isnt friday :(");
    }

    System.out.println("=== Records ===");
    Seed seed = new Seed(1, "User Seed");
    seed.Display();

    System.out.println("=== OOP ===");
    UseCase sayHelloUseCase = new SayHelloUseCase();
    sayHelloUseCase.execute();
  }
}