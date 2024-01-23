public class firstToUppercase {

    public static String firstLetterUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char currChar = str.charAt(0);

        sb.append(Character.toUpperCase(currChar));
        int i = 1;
        while (i < str.length() - 1) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, i am maanas sehgal, how are you?";
        System.out.println(firstLetterUppercase(str));
    }
}
