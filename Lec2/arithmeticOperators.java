package Lec2;

public class arithmeticOperators {

  public static void main(String[] args) {
    int a = 10, b = 5;

    System.out.println("Add: " + (a + b));
    System.out.println("Subtract: " + (a - b)); 
    System.out.println("Multiply: " + (a * b));
    System.out.println("Divide: " + (a / b));

    //Pre increment
    int c = ++a;
    System.out.println("c: " + c + " and a: " + a);

    //Post increment
    int d = b++;
    System.out.println("d: " + d + " and b: " + b);
  }
}
