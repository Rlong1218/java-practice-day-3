import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenlySpacedTest {

    @Test
    void evenlySpaced() {
        assertTrue(EvenlySpaced.evenlySpaced(4,6,8));
        assertTrue(EvenlySpaced.evenlySpaced(3,9,6));
        assertTrue(EvenlySpaced.evenlySpaced(10,20,30));
        assertTrue(EvenlySpaced.evenlySpaced(8,4,6));
        assertFalse(EvenlySpaced.evenlySpaced(4,7,8));
        assertFalse(EvenlySpaced.evenlySpaced(8,4,7));
        assertFalse(EvenlySpaced.evenlySpaced(1,7,5));

    }
}