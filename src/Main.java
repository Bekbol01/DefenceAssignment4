import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");

        DirectedGraph<String> graph = new DirectedGraph<>();
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);

        graph.addEdge(vertexA, vertexB, 5.0);
        graph.addEdge(vertexB, vertexC, 3.0);
        graph.addEdge(vertexC, vertexA, 2.0);

        Vertex<String> startVertex = vertexA;
        Map<Vertex<String>, Double> adjacentVertices = startVertex.getAdjacentVertices();
        for (Map.Entry<Vertex<String>, Double> entry : adjacentVertices.entrySet()) {
            Vertex<String> destination = entry.getKey();
            double weight = entry.getValue();
            System.out.println("Edge from " + startVertex.getData() + " to " + destination.getData() + " with weight: " + weight);
        }
    }
}
