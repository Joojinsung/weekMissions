package chapter41;

public class VIPCustomer extends Customer {
    static int serialNums = 1;
    private String agentID;
    private double bonusPointRatio;



    //행위

    public VIPCustomer(String name) {
        super();

        this.customerID = "VIP" + serialNums++;
//        this.agentID = agentID;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.5;
    }


    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * bonusPointRatio;
        return price;
    }
    public void callAgentr() {
        System.out.println("담당직원 " + this.agentID + " 님 문의 드릴게 있어요");
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                ", agentID='" + agentID + '\'' +
                ", discountRatio=" + bonusPointRatio +
                '}';
    }
}
