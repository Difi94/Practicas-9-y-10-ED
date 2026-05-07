package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleCoverage {

    // Caso 1: valores positivos
    @Test
    void testValoresPositivos() {

        Rectangle r = new Rectangle(3, 4);

        assertAll(
            () -> assertEquals(12, r.surface()),
            () -> assertEquals(14, r.perimeter())
        );
    }

    // Caso 2: valores negativos
    @Test
    void testValoresNegativos() {

        Rectangle r = new Rectangle(-3, 4);

        assertAll(
            () -> assertEquals(-1, r.surface()),
            () -> assertEquals(-1, r.perimeter())
        );
    }

    // Caso 3: valores cero
    @Test
    void testValoresCero() {

        Rectangle r = new Rectangle(0, 4);

        assertAll(
            () -> assertEquals(0, r.surface()),
            () -> assertEquals(0, r.perimeter())
        );
    }
}