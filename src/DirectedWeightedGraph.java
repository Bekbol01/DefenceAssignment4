import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedWeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<V>>> map = new HashMap<>();

    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        List<Edge<V>> edges = map.get(source);
        edges.add(new Edge<>(source.getData(), dest.getData(), weight));
    }

    public Map<Vertex<V>, List<Edge<V>>> getMap() {
        return map;
    }
}
