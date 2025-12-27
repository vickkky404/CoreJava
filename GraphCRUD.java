import java.util.*;

public class GraphCRUD {
    private Map<Integer, List<Integer>> adjList;

    public GraphCRUD() {
        adjList = new HashMap<>();
    }

    // CREATE - Add vertex
    public void addVertex(int vertex) {
        if (!adjList.containsKey(vertex)) {
            adjList.put(vertex, new ArrayList<>());
            System.out.println("Added vertex " + vertex);
        }
    }

    // CREATE - Add edge
    public void addEdge(int u, int v) {
        if (!adjList.containsKey(u)) addVertex(u);
        if (!adjList.containsKey(v)) addVertex(v);
        adjList.get(u).add(v);
        System.out.println("Added edge " + u + " -> " + v);
    }

    // READ - Display graph
    public void display() {
        System.out.println("Graph:");
        for (Integer vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for (Integer neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // READ - Check if edge exists
    public boolean hasEdge(int u, int v) {
        return adjList.containsKey(u) && adjList.get(u).contains(v);
    }

    // READ - Get neighbors
    public List<Integer> getNeighbors(int vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    // UPDATE - Remove edge
    public void removeEdge(int u, int v) {
        if (adjList.containsKey(u)) {
            adjList.get(u).remove(Integer.valueOf(v));
            System.out.println("Removed edge " + u + " -> " + v);
        }
    }

    // DELETE - Remove vertex
    public void removeVertex(int vertex) {
        if (adjList.containsKey(vertex)) {
            adjList.remove(vertex);
            for (List<Integer> neighbors : adjList.values()) {
                neighbors.remove(Integer.valueOf(vertex));
            }
            System.out.println("Removed vertex " + vertex);
        }
    }

    // BFS traversal
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (Integer neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphCRUD graph = new GraphCRUD();

        System.out.println("=== Graph CRUD Operations ===");
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.display();

        System.out.println("Has edge 1->2: " + graph.hasEdge(1, 2));

        graph.removeEdge(1, 3);
        graph.display();

        graph.bfs(1);
    }
}
