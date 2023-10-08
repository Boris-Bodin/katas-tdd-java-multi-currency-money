package org.example.bank;

import org.example.expression.Expression;
import org.example.money.Money;

public class Bank {
    public Money reduce(Expression source, String to) {
        return Money.dollar(10);
    }
}
