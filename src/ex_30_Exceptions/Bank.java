package ex_30_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) throws CurrenyMismatchCustomException {
        if (bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        } else {
            throw new CurrenyMismatchCustomException("Currency mismatch");
        }

    }
}

class CurrenyMismatchCustomException extends Exception {
    public CurrenyMismatchCustomException(String msg) {
        super(msg);
    }
}