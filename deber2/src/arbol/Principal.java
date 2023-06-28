package arbol;

public class Principal {
	 public static void main(String[] args) {
	        ArbolBinario arbol = new ArbolBinario();
	        
	        arbol.insertar(50);
	        arbol.insertar(30);
	        arbol.insertar(20);
	        arbol.insertar(40);
	        arbol.insertar(70);
	        arbol.insertar(60);
	        arbol.insertar(80);
	        System.out.println("--------------------------------------------");	        
	        System.out.println("arbol binario despues de insertar valores:");
	        arbol.imprimirEnOrden();
	        
	        int valorBuscado = 40;
	        System.out.println("\nBusqueda de " + valorBuscado + ": " + arbol.buscar(valorBuscado));
	        
	        int valorEliminar = 30;
	        arbol.eliminar(valorEliminar);
	        System.out.println("\nArbol binario despues de eliminar el valor " + valorEliminar + ":");
	        arbol.imprimirEnOrden();
	        System.out.println("--------------------------------------------");	        

	    }
}
