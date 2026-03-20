import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
package hdt7;

/**
 * Clase que traduce texto usando el árbol binario
 */
public class Traductor {

    public static void traducirTexto(String rutaTexto,
        ArbolBinario<Asociacion<String, String>> arbol) {

        try (BufferedReader br = new BufferedReader(new FileReader(rutaTexto))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] palabras = linea.split(" ");

                for (String palabra : palabras) {

                    // Limpiar signos básicos
                    String limpia = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    Asociacion<String, String> resultado =
                        arbol.buscar(new Asociacion<>(limpia, null));

                    if (resultado != null) {
                        System.out.print(resultado.getValor() + " ");
                    } else {
                        System.out.print("*" + palabra + "* ");
                    }
                }

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error leyendo texto: " + e.getMessage());
        }
    }
}