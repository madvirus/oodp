package madvirus.oodp.chap02.encapulation;

public class Customer {
    private Wallet wallet;

    public int getPayment(int payment) {
        if (wallet == null) throw new NotEnoughMoneyException();
        if (wallet.getTotalMoney() >= payment) {
            wallet.substractMoney(payment);
            return payment;
        }
        throw new NotEnoughMoneyException();
    }
}

