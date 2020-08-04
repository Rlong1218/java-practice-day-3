import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {

    @Test
    void blackjack() {
        assertEquals(0, BlackJack.blackjack(22, 24));
        assertEquals(21, BlackJack.blackjack(21, 24));
        assertEquals(20, BlackJack.blackjack(20, 4));
        assertEquals(2, BlackJack.blackjack(2, 1));
        assertEquals(19, BlackJack.blackjack(19, 22));
    }
}