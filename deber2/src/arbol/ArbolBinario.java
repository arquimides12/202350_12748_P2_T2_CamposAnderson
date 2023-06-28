package arbol;

public class ArbolBinario {
private Nodo raiz;
    
    public ArbolBinario() {
        raiz = null;
    }
    
    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }
    
    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
        } else {
            if (valor < nodo.getValor()) {
                nodo.setHijoIzquierdo(insertarNodo(nodo.getHijoIzquierdo(), valor));
            } else {
                nodo.setHijoDerecho(insertarNodo(nodo.getHijoDerecho(), valor));
            }
        }
        return nodo;
    }
    
    public boolean buscar(int valor) {
        return buscarNodo(raiz, valor);
    }
    
    private boolean buscarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        } else if (valor == nodo.getValor()) {
            return true;
        } else if (valor < nodo.getValor()) {
            return buscarNodo(nodo.getHijoIzquierdo(), valor);
        } else {
            return buscarNodo(nodo.getHijoDerecho(), valor);
        }
    }
    
    public void imprimirEnOrden() {
        imprimirEnOrdenNodo(raiz);
    }
    
    private void imprimirEnOrdenNodo(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenNodo(nodo.getHijoIzquierdo());
            System.out.println(nodo.getValor());
            imprimirEnOrdenNodo(nodo.getHijoDerecho());
        }
    }
    
    public void eliminar(int valor) {
        raiz = eliminarNodo(raiz, valor);
    }
    
    private Nodo eliminarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        } else {
            if (valor < nodo.getValor()) {
                nodo.setHijoIzquierdo(eliminarNodo(nodo.getHijoIzquierdo(), valor));
            } else if (valor > nodo.getValor()) {
                nodo.setHijoDerecho(eliminarNodo(nodo.getHijoDerecho(), valor));
            } else {
                if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
                    nodo = null;
                } else if (nodo.getHijoIzquierdo() == null) {
                    nodo = nodo.getHijoDerecho();
                } else if (nodo.getHijoDerecho() == null) {
                    nodo = nodo.getHijoIzquierdo();
                } else {
                    Nodo sucesor = obtenerSucesor(nodo.getHijoDerecho());
                    nodo.setValor(sucesor.getValor());
                    nodo.setHijoDerecho(eliminarNodo(nodo.getHijoDerecho(), sucesor.getValor()));
                }
            }
        }
        return nodo;
    }
    
    private Nodo obtenerSucesor(Nodo nodo) {
        while (nodo.getHijoIzquierdo() != null) {
            nodo = nodo.getHijoIzquierdo();
        }
        return nodo;
    }
}
