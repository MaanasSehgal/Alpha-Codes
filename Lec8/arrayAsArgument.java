public class arrayAsArgument {

  public static void update(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] += 1;
    }
  }

  public static void printArray(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int marks[] = { 97, 98, 99 };

    //before updating
    System.out.println("Before updating, marks: ");
    printArray(marks);

    update(marks);

    //after updating
    System.out.println("After updating, marks: ");
    printArray(marks);
  }
}
