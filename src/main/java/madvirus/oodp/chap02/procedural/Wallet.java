package madvirus.oodp.chap02.procedural;

public class Wallet {
    private int money;

    public int getTotalMoney() {
        return money;
    }
    public void substractMoney(int debit) {
        money -= debit;
    }
}
