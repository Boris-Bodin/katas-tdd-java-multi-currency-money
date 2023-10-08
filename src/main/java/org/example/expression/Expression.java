package org.example.expression;

import org.example.bank.Bank;
import org.example.money.Money;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression times(int multiplier);

    Expression plus(Expression addend);
}
