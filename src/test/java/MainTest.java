import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.examen.tecnico.EncontrarSumaArray;

public class MainTest {

    EncontrarSumaArray encontrarSuma = new EncontrarSumaArray();

    @Test
    public void testEncontrarSuma() {
        assertTrue(encontrarSuma.encontrarSuma(new int[]{1, 2, 4, 4}, 8));
        assertFalse(encontrarSuma.encontrarSuma(new int[]{1, 4, 3, 9}, 8));
        assertFalse(encontrarSuma.encontrarSuma(new int[]{}, 8));
        assertFalse(encontrarSuma.encontrarSuma(new int[]{1, 2, 3}, 7));
    }

    @Test
    public void testEncuentraSumaEficiente() {
        assertTrue(encontrarSuma.encuentraSumaEficiente(new int[]{1, 2, 4, 4}, 8));
        assertFalse(encontrarSuma.encuentraSumaEficiente(new int[]{1, 4, 3, 9}, 8));
        assertFalse(encontrarSuma.encuentraSumaEficiente(new int[]{}, 8));
        assertFalse(encontrarSuma.encuentraSumaEficiente(new int[]{1, 2, 3}, 7));
    }
}