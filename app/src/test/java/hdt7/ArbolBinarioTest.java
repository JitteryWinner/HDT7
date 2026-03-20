package hdt7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class ArbolBinarioTest {

    @Test
    public void testInsertarYBuscar() {
        ArbolBinario<Asociacion<String, String>> arbol = new ArbolBinario<>();

        arbol.insertar(new Asociacion<>("house", "casa"));
        arbol.insertar(new Asociacion<>("dog", "perro"));
        arbol.insertar(new Asociacion<>("woman", "mujer"));

        Asociacion<String, String> resultado =
            arbol.buscar(new Asociacion<>("dog", null));

        assertNotNull(resultado);
        assertEquals("perro", resultado.getValor());
    }

    @Test
    public void testBuscarNoExiste() {
        ArbolBinario<Asociacion<String, String>> arbol = new ArbolBinario<>();

        arbol.insertar(new Asociacion<>("house", "casa"));

        Asociacion<String, String> resultado =
            arbol.buscar(new Asociacion<>("cat", null));

        assertNull(resultado);
    }
}