package storePayment.chapter43;

import java.util.Objects;

public class Customer {
    static int serialNums = 1;


    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    //행위
    public int calculatePrice(int price) {

        this.bonusPoint += (int) (price * bonusPointRatio);
        return price;
    }

    Customer() {

    }


    public Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;


    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID && customer.name == this.name;
        }
        return false;
    }

}
