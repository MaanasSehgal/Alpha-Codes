package Lec36;

import java.util.*;

public class KosarajusAlgorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> s) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visited[e.dest]) {
                topSort(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        // neighbours
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void transposeGraph(ArrayList<Edge> transpose[], ArrayList<Edge> graph[], int V, boolean visited[]) {
        for (int i = 0; i < transpose.length; i++) {
            visited[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);// e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));// reverse edge
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        // Step1: Topological sort
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topSort(graph, i, visited, s);
            }
        }

        // Step2: transpose graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[V];
        transposeGraph(transpose, graph, V, visited);

        // Step3: Call dfs for stack nodes
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                System.out.print("SCC -> ");
                dfs(transpose, curr, visited);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
