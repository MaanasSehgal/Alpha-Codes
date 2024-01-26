package Practice;

public class compassRoutes {

    public static float findShortestDistance(String directions) {
        int x = 0, y = 0;

        for (int i = 0; i < directions.length(); i++) {
            char currChar = directions.charAt(i);

            switch (currChar) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }

        //root of x2 - x1 sq + y2 - y1 sq
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String args[]) {
        String directions = "WNEENESENNN";

        System.out.println(findShortestDistance(directions));
    }
}
