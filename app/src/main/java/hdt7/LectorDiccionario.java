package hdt7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Clase encargada de leer el archivo diccionario.txt
 */
public class LectorDiccionario {

    public static ArbolBinario<Asociacion<String, String>> cargarDiccionario(String ruta) {
        ArbolBinario<Asociacion<String, String>> arbol = new ArbolBinario<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null) {

                linea = linea.trim();

                // Quitar paréntesis
                linea = linea.replace("(", "").replace(")", "");

                // Separar por coma
                String[] partes = linea.split(",");

                if (partes.length == 2) {
                    String ingles = partes[0].trim().toLowerCase();
                    String espanol = partes[1].trim().toLowerCase();

                    arbol.insertar(new Asociacion<>(ingles, espanol));
                }
            }

        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return arbol;
    }
}