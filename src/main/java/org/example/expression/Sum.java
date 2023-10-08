package org.example.expression;

import org.example.bank.Bank;
import org.example.money.Money;

public class Sum implements Expression {
    private final Expression augend;
    private final Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank,to).amount() + addend.reduce(bank,to).amount();
        return new Money(amount, to);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier),addend.times(multiplier));
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }
}
