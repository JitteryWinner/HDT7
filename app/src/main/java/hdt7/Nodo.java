package hdt7;
/**
 * Nodo para el árbol binario
 */
public class Nodo<E> {

    E dato;
    Nodo<E> izquierdo;
    Nodo<E> derecho;

    public Nodo(E dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}