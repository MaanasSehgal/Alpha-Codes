package Practice;

public class evenWords {

    public static void printEvenLengthWords(String str) {
        int start = 0;
        int end = 0;
        int n = str.length();

        while (end < n) {
            //find word
            while (end < n && str.charAt(end) != ' ') {
                end++;
            }

            if ((end - start) % 2 == 0) {
                System.out.print(str.substring(start, end) + ", ");
            }

            end++;
            start = end;
        }
    }

    public static void main(String[] args) {
        String str = "Hey Maanas bhai kesa he tu ree oye ek bat bta tune kya aj ka homework kra he";

        printEvenLengthWords(str);
    }
}
