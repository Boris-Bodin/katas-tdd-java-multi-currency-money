package org.example.money;

public abstract class Money {

    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money euro(int amount) {
        return new Euro(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(object.getClass());
    }
}
