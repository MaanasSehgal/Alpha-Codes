import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }

        System.out.println(cost);
    }
}

// Output with greedy
// 2 3 3 4 6
// 2 5 3 4 6
// 2 5 8 4 6
// 2 5 8 12 6
// 2 5 8 12 18
// 18 + 12 + 8 + 5 = 43

// Output with pq
// 2 3 3 4 6
// 5 3 4 6 => 5
// 5 7 6 => 7
// 7 11 => 11
// 18 => 18
// 18 + 11 + 7 + 5 = 41