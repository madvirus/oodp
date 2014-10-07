package madvirus.oodp.chap02.procedural;

import java.util.List;

public class Paperboy {
    public List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void collectMoney() {
        for (Customer customer : customers) {
            int payment = 10000;
            Wallet wallet = customer.getWallet();
            if (wallet.getTotalMoney() >= payment) {
                wallet.substractMoney(payment);
            } else {
                // 다음에 요금 받으러 오는 처리
            }
        }
    }
}
