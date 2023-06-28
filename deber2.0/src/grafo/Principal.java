package grafo;

public class Principal {
	public static void main(String[] args) {
        // Crear un objeto Grafo
        Grafo grafo = new Grafo();

        // Agregar vértices
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");

        // Agregar aristas
        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");
        grafo.agregarArista("C", "D");
        grafo.agregarArista("C", "E");
        grafo.agregarArista("D", "E");

        // Obtener vecinos de un vértice
        System.out.println("Vecinos de A: " + grafo.obtenerVecinos("A"));
        System.out.println("Vecinos de B: " + grafo.obtenerVecinos("B"));
        System.out.println("Vecinos de C: " + grafo.obtenerVecinos("C"));
        System.out.println("Vecinos de D: " + grafo.obtenerVecinos("D"));
        System.out.println("Vecinos de E: " + grafo.obtenerVecinos("E"));
    }
}
