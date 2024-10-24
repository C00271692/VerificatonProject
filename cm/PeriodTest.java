package cm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeriodTest {

    @Test
    void testValidPeriod() {
        Period period = new Period(8, 12);
        assertNotNull(period);
    }

    @Test
    void testInvalidPeriod() {
        assertThrows(IllegalArgumentException.class, () -> new Period(12, 8));
        assertThrows(IllegalArgumentException.class, () -> new Period(-1, 10));
        assertThrows(IllegalArgumentException.class, () -> new Period(10, 25));
    }

    @Test
    void testOverlaps() {
        Period period1 = new Period(8, 12);
        Period period2 = new Period(10, 14);
        Period period3 = new Period(12, 16);
        assertTrue(period1.overlaps(period2));
        assertFalse(period1.overlaps(period3));
    }

    @Test
    void testDuration() {
        Period period = new Period(8, 12);
        assertEquals(4, period.duration());
    }
}