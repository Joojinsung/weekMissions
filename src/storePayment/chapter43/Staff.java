package storePayment.chapter43;

import storePayment.chapter41.Customer;

public class Staff  {
    private int stalesAmount;



    public int helpPay(Customer customer, int price) {
        return customer.calculatePrice(price);
    }

    public int helpPayment(VIPCustomer vipCustomer, int price) {
        return vipCustomer.calculatePrice(price);
    }

    public int getStalesAmount() {
        return stalesAmount;
    }

    public void setStalesAmount(int stalesAmount) {
        this.stalesAmount = stalesAmount;
    }

    public void addSalesAmont(int amount) {
        this.stalesAmount += amount;
    }

    public void printMySalseAmount() {
        System.out.println("최종 매상은 " + this.stalesAmount + " 원입니다");
    }

    @Override
    public String toString() {
        return "Staff{" +
                "stalesAmount=" + stalesAmount +
                '}';
    }
}
