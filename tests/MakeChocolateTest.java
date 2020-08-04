import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeChocolateTest {

    @Test
    void makeChocolate() {
        assertEquals(4, MakeChocolate.makeChocolate(5, 1, 9));
        assertEquals(-1, MakeChocolate.makeChocolate(3, 1, 11));
        assertEquals(1, MakeChocolate.makeChocolate(2, 200, 6));
        assertEquals(11, MakeChocolate.makeChocolate(16, 2, 21));
        assertEquals(-1, MakeChocolate.makeChocolate(22, 0, 23));
    }
}