import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckySumTest {

    @Test
    void luckySum() {
        assertEquals(0, LuckySum.luckySum(13,4,9));
        assertEquals(4, LuckySum.luckySum(4,13,5));
        assertEquals(10, LuckySum.luckySum(4,6,13));
        assertEquals(15, LuckySum.luckySum(1,4,10));
    }
}