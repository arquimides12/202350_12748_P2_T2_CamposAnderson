package grafo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Grafo {
	private Map<String, List<String>> vertices;

    public Grafo() {
        vertices = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        vertices.put(vertice, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino) {
        if (vertices.containsKey(origen) && vertices.containsKey(destino)) {
            vertices.get(origen).add(destino);
            vertices.get(destino).add(origen); // Si el grafo es no dirigido, se agrega esta línea
        }
    }

    public List<String> obtenerVecinos(String vertice) {
        return vertices.get(vertice);
    }
}
