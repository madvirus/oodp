package madvirus.oodp.chap02.encapulation;

import java.util.List;

public class Paperboy {
    public List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void collectMoney() {
        for (Customer customer : customers) {
            int payment = 10000;
            try {
                int paidAmount = customer.getPayment(payment);
                // ...
            } catch(NotEnoughMoneyException ex) {
                // 다음에 요금 받으러 오는 처리
            }
        }
    }
}
