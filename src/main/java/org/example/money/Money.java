package org.example.money;

import org.example.bank.Bank;
import org.example.expression.Expression;
import org.example.expression.Sum;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money euro(int amount) {
        return new Money(amount, "EUR");
    }

    public Expression times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public int amount() {
        return this.amount;
    }

    public String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(((Money) object).currency);
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);
        return new Money(amount / rate, to);
    }
}
