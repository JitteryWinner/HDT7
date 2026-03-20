package hdt7;

/**
 * Clase principal
 */
public class Main {

    public static void main(String[] args) {

        String ruta = "data/diccionario.txt";

        ArbolBinario<Asociacion<String, String>> arbol =
                LectorDiccionario.cargarDiccionario(ruta);

        System.out.println("Diccionario en orden (In-Order):");
        arbol.inOrder();
    }
}