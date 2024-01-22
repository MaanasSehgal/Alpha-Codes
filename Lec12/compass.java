//given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
// WNEENESENNN
public class compass {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N') {
                x++;
            } else if (direction == 'S') {
                x--;
            } else if (direction == 'E') {
                y++;
            } else if (direction == 'W') {
                y--;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        String path = "NSN";

        System.out.println(getShortestPath(path));
    }
}
