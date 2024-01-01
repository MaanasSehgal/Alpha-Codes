package Lec3;

public class ifElse {

  public static void main(String[] args) {
    int age = 22;

    if (age >= 18) {
      System.out.println("Adult : Drive, Vote");
    } else if (age > 13 && age < 18) {
      System.out.println("Teenager");
    } else {
      System.out.println("Not adult");
    }
  }
}
