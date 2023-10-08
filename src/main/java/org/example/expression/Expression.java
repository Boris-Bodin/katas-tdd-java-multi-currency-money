package org.example.expression;

import org.example.money.Money;

public interface Expression {
    Money reduce(String to);
}
