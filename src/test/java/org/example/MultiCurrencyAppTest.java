package org.example;

import org.example.money.Dollar;
import org.example.money.Euro;
import org.example.money.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MultiCurrencyAppTest {

    @Test
    public void testMultipication() {
        Money dollar = Money.dollar(5);
        assertEquals(Money.dollar(10), dollar.times(2));
        assertEquals(Money.dollar(15), dollar.times(3));
    }

    @Test
    public void testEuroMultipication() {
        Money euro = Money.euro(5);
        assertEquals(Money.euro(10), euro.times(2));
        assertEquals(Money.euro(15), euro.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(6), Money.dollar(8));
        assertEquals(Money.euro(5), Money.euro(5));
        assertNotEquals(Money.euro(6), Money.euro(8));
        assertNotEquals(Money.dollar(5), Money.euro(5));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("EUR", Money.euro(1).currency());
    }
}
