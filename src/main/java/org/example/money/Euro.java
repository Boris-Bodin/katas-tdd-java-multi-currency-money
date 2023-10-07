package org.example.money;

public class Euro {

    private final int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    public Euro times(int multiplier) {
        return new Euro(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Euro dollar = (Euro) object;
        return this.amount == dollar.amount;
    }
}
