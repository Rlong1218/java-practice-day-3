import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneSumTest {

    @Test
    void loneSum() {
        assertEquals(0, LoneSum.loneSum(5,5,5));
        assertEquals(10, LoneSum.loneSum(5,3,2));
        assertEquals(6, LoneSum.loneSum(1,6,1));
        assertEquals(3, LoneSum.loneSum(10,10,3));
        assertEquals(8, LoneSum.loneSum(8,1,1));

    }
}