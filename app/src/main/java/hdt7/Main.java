package hdt7;

/**
 * Clase principal
 */
public class Main {

    public static void main(String[] args) {

        String rutaDiccionario = "data/diccionario.txt";
        String rutaTexto = "data/texto.txt";

        // Cargar diccionario
        ArbolBinario<Asociacion<String, String>> arbol =
                LectorDiccionario.cargarDiccionario(rutaDiccionario);

        // Mostrar diccionario ordenado
        System.out.println("Diccionario en orden");
        arbol.inOrder();

        System.out.println("\nTraducción");

        // Traducir texto
        Traductor.traducirTexto(rutaTexto, arbol);
    }
}
