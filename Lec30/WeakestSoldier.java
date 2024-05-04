import java.util.PriorityQueue;

public class WeakestSoldier {

    static class Soldier implements Comparable<Soldier> {
        int idx;
        int strength;

        public Soldier(int idx, int strength) {
            this.idx = idx;
            this.strength = strength;
        }

        @Override
        public int compareTo(Soldier s) {
            if (this.strength == s.strength) {
                return this.idx - s.idx;
            }
            return this.strength - s.strength;
        }
    }

    public static void main(String[] args) {
        int[][] soldiers = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int m = 4, n = 4, k = 2;

        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                strength += soldiers[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Soldier(i, strength));
        }

        while (k-- > 0) {
            System.out.print(pq.remove().idx + " ");
        }
    }
}
