package hdt7;
/**
 * Árbol Binario de Búsqueda (BST)
 * 
 * Referencia:
 * Goodrich, Tamassia, Goldwasser
 */
public class ArbolBinario<E extends Comparable<E>> {

    private Nodo<E> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    /**
     * Inserta un elemento en el árbol
     */
    public void insertar(E valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo<E> insertarRec(Nodo<E> actual, E valor) {
        if (actual == null) {
            return new Nodo<>(valor);
        }

        if (valor.compareTo(actual.dato) < 0) {
            actual.izquierdo = insertarRec(actual.izquierdo, valor);
        } else if (valor.compareTo(actual.dato) > 0) {
            actual.derecho = insertarRec(actual.derecho, valor);
        }

        return actual;
    }

    /**
     * Busca un elemento en el árbol
     */
    public E buscar(E valor) {
        return buscarRec(raiz, valor);
    }

    private E buscarRec(Nodo<E> actual, E valor) {
        if (actual == null) {
            return null;
        }

        if (valor.compareTo(actual.dato) == 0) {
            return actual.dato;
        }

        if (valor.compareTo(actual.dato) < 0) {
            return buscarRec(actual.izquierdo, valor);
        } else {
            return buscarRec(actual.derecho, valor);
        }
    }
    // Agregar este método a tu clase ArbolBinario

    /**
     * Recorrido in-order (izquierda, raíz, derecha)
     */
    public void inOrder() {
        inOrderRec(raiz);
    }

    private void inOrderRec(Nodo<E> actual) {
        if (actual != null) {
            inOrderRec(actual.izquierdo);
            System.out.println(actual.dato);
            inOrderRec(actual.derecho);
        }
}
}