package hwlec13;

public class hw2 {

    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("Before swap, x: " + x + " and y: " + y);

        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
        
        System.out.println("After swap, x: " + x + " and y: " + y);
    }
}
