package Lec2;

public class hw3 {

  public static void main(String[] args) {
    int x, y, z;

    x = y = z = 2;//x = 2, y = 2, z = 2
    x += y;//x = 4, y = 2, z = 2
    y -= z;//x = 4, y = 0, z = 2
    z /= (x + y);//x = 4, y = 0, z = 2 / 4 = 1 / 2 = 0
    System.out.println(x + " " + y + " " + z);
    //Final Output: 4 0 0
  }
}
