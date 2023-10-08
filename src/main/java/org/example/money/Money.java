package org.example.money;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return  new Dollar(amount, "USD");
    }

    public static Money euro(int amount) {
        return new Euro(amount, "EUR");
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(object.getClass());
    }
}
