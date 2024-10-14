import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cm.KrakowiakKacperTestTask1;

import static org.junit.jupiter.api.Assertions.*;

class KrakowiakKacperTestTask1Test {

    @Test
    @DisplayName("Test of add method")
    void add() {
        assertEquals(4, KrakowiakKacperTestTask1.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, KrakowiakKacperTestTask1.multiply(2, 2)),
                () -> assertEquals(-4, KrakowiakKacperTestTask1.multiply(2, -2)),
                () -> assertEquals(4, KrakowiakKacperTestTask1.multiply(-2, -2)),
                () -> assertEquals(0, KrakowiakKacperTestTask1.multiply(1, 0)));
    }
}