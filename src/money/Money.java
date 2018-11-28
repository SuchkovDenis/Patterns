package money;

import java.math.BigDecimal;

public class Money {
    private final Currency currency;
    private final BigDecimal amount;

    public Money(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = BigDecimal.valueOf(amount).stripTrailingZeros();
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
