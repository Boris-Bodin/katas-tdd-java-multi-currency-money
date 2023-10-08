package org.example;

import org.example.money.Dollar;
import org.example.money.Euro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MultiCurrencyAppTest {

    @Test
    public void testMultipication() {
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    public void testEuroMultipication() {
        Euro euro = new Euro(5);
        assertEquals(new Euro(10), euro.times(2));
        assertEquals(new Euro(15), euro.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(6), new Dollar(8));
        assertEquals(new Euro(5), new Euro(5));
        assertNotEquals(new Euro(6), new Euro(8));
    }
}
