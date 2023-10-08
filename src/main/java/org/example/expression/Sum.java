package org.example.expression;

import org.example.money.Money;

public class Sum implements Expression {
    private final Money augend;
    private final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.amount() + addend.amount();
        return new Money(amount, to);
    }
}
