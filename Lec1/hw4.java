package Lec1;

public class hw4 {

  public static void main(String[] args) {
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    //everything converts to double
    double result = (f * b) + (i % c) - (d * s);

    System.out.println("The result is: " + result);
  }
}
