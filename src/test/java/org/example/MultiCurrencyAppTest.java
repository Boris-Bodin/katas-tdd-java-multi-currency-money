package org.example;

import org.example.money.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiCurrencyAppTest {

    @Test
    public void testMultipication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        assertEquals(10, dollar.amount);
    }
}
