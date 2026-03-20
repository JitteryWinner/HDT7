package hdt7;
/**
 * Clase Asociacion<K, V>
 * Representa una relación clave-valor.
 * 
 * Referencia:
 * Basado en Map.Entry de Java
 */
public class Asociacion<K extends Comparable<K>, V> implements Comparable<Asociacion<K, V>> {

    private K clave;
    private V valor;

    public Asociacion(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Asociacion<K, V> otra) {
        return this.clave.compareTo(otra.clave);
    }

    @Override
    public String toString() {
        return "(" + clave + ", " + valor + ")";
    }
}