package hdt7;

/**
 * Clase principal
 */
public class Main {

    public static void main(String[] args) {
        
        String rutaDiccionario = "app/src/main/resources/diccionario.txt";
        String rutaTexto = "app/src/main/resources/texto.txt";

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
