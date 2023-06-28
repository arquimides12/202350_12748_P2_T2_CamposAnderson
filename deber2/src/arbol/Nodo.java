package arbol;

public class Nodo {
	 private int valor;
	    private Nodo hijoIzquierdo;
	    private Nodo hijoDerecho;
	    
	    public Nodo(int valor) {
	        this.valor = valor;
	        this.hijoIzquierdo = null;
	        this.hijoDerecho = null;
	    }
	    
	    public int getValor() {
	        return valor;
	    }
	    
	    public Nodo getHijoIzquierdo() {
	        return hijoIzquierdo;
	    }
	    
	    public void setHijoIzquierdo(Nodo nodo) {
	        hijoIzquierdo = nodo;
	    }
	    
	    public Nodo getHijoDerecho() {
	        return hijoDerecho;
	    }
	    
	    public void setHijoDerecho(Nodo nodo) {
	        hijoDerecho = nodo;
	    }

		public void setValor(int valor2) {
			// TODO Auto-generated method stub
			
		}
}
