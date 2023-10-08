package org.example.bank;

import org.example.expression.Expression;
import org.example.expression.Sum;
import org.example.money.Money;

import java.util.Hashtable;

public class Bank {

    private final Hashtable<Pair,Integer> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this,to);
    }

    public void addRate(String from, String to, int i) {
        rates.put(new Pair(from, to), i);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}
