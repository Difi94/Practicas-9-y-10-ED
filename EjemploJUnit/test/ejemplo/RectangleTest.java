package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

    // Caso 1: valores positivos
    @Test
    void testValoresPositivosConError() {
        Rectangle r = new Rectangle(3, 4);

        assertAll(
            () -> assertEquals(999, r.surface()),   // ERROR intencionado
            () -> assertEquals(14, r.perimeter())
        );
    }

    // Caso 2: valores negativos
    @Test
    void testValoresNegativosConError() {
        Rectangle r = new Rectangle(-3, 4);

        assertAll(
            () -> assertEquals(-1, r.surface()),
            () -> assertEquals(100, r.perimeter())  // ERROR intencionado
        );
    }

    // Caso 3: valores cero
    @Test
    void testValoresCeroConError() {
        Rectangle r = new Rectangle(0, 4);

        assertAll(
            () -> assertEquals(1, r.surface()),     // ERROR intencionado
            () -> assertEquals(0, r.perimeter())
        );
    }
}