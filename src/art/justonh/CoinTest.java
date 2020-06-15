package art.justonh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    void turnOver() {
        Coin c = new Coin();
        c.turnOver();
        assertFalse(c.isHeadsUp());
    }

    @Test
    void isHeadsUp() {
        Coin c = new Coin();
        assertTrue(c.isHeadsUp());
    }

}