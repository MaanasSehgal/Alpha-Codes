public class linearSearchMenu {

  public static int linearSearch(String menu[], String order) {
    for (int i = 0; i < menu.length; i++) {
      if (order.equals(menu[i])) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    String menu[] = { "dosa", "chole bhature", "samosa", "baigan", "halwa" };
    String order = "baigan";

    int orderNumber = linearSearch(menu, order);

    System.out.println("Order Number is: " + orderNumber);
  }
}
