package org.example.money;

public class Euro extends Money {

    public Euro(int amount) {
        this.amount = amount;
    }

    public Euro times(int multiplier) {
        return new Euro(this.amount * multiplier);
    }
}
