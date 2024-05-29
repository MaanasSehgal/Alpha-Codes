
import java.util.*;

public class CycleDetectionDirectedGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 3));

        // graph[2].add(new Edge(2, 3));

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 2));

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        int V = graph.length;
        boolean visited[] = new boolean[V];
        boolean stack[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, i, visited, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], int curr, boolean visited[], boolean stack[]) {
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {// cycle exists
                return true;
            }
            if (!visited[e.dest] && detectCycleUtil(graph, e.dest, visited, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
