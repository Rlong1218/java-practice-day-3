import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseFarTest {

    @Test
    void closeFar() {
        assertTrue(CloseFar.closeFar(1,2,4));
        assertTrue(CloseFar.closeFar(2,2,5));
        assertTrue(CloseFar.closeFar(4,3,8));
        assertFalse(CloseFar.closeFar(1,2,3));
        assertFalse(CloseFar.closeFar(2,2,3));
        assertFalse(CloseFar.closeFar(5,2,2));
    }
}