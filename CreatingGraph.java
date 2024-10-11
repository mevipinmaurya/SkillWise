import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<List<Integer>> adjacencyList;

    // Constructor to initialize the graph with a given number of vertices
    public Graph(int vertices) {
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        // Uncomment the next line for an undirected graph
        // adjacencyList.get(destination).add(source);
    }

    // Method to display the graph
    public void displayGraph() {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer edge : adjacencyList.get(i)) {
                System.out.print(" -> " + edge);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the graph
        graph.displayGraph();
    }
}
