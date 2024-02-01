package Lec16.hwlec16;

public class hw2 {

    static String map[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void f(int year) {
        if (year == 0) {
            return;
        }

        f(year / 10);
        System.out.print(map[year % 10] + " ");
    }

    public static void main(String[] args) {
        int year = 2019;
        f(year);
    }
}
