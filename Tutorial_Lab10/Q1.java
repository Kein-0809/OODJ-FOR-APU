package Tutorial_Lab10;
import java.util.Scanner;


class Area_Triangle {

  public void formulae_T(double breadth, double height) {
    double area_T = breadth * height / 2;
    System.out.println(area_T);
  }
}

class Area_Circle {

  public void formulae_C(double radius) {
    double area_C = Math.pow(radius, 2) * Math.PI;
    System.out.println((Math.floor(area_C * 100)) / 100);
  }
}

public class Q1 {
  public static void main(String[] args) {
    Area_Triangle tri = new Area_Triangle();
    Area_Circle cir = new Area_Circle();
    System.out.println("\nFORMULAE CALCULATION\n1. Area of Circle\n2. Area of Triangle\n");
    System.out.println("Enter your choice: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    if(number == 1) {
      System.out.println("Enter the Radius of the Circle: ");
      double radius = scan.nextDouble();
      cir.formulae_C(radius);
    } else if(number == 2) {
      System.out.println("Enter the breadth and height: ");
      double breadth = scan.nextDouble();
      double height = scan.nextDouble();
      tri.formulae_T(breadth, height);
    }

  }
}
