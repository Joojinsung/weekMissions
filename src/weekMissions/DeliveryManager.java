package weekMissions;

public class DeliveryManager {
    private int daysForDeliver;
    private int costForDeliver;
    private long shoesPrice;

    private long totalMoney = 100000;

    public int getCostForDeliver() {
        return costForDeliver;
    }

    public void setCostForDeliver(int costForDeliver) {
        this.costForDeliver = costForDeliver;
    }

    public DeliveryManager(int daysForDeliver, int costForDeliver, long shoesPrice) {
        this.daysForDeliver = daysForDeliver;
        this.costForDeliver = costForDeliver;
        this.shoesPrice = shoesPrice;
    }

    public long answerManager() {
        System.out.println("신발의 가격은 " + shoesPrice + " 원 입니다");
        System.out.println("배송 예정 소요일은 " + daysForDeliver + " 일 입니다. 그리고 " + " 배송료는 " + costForDeliver + " 원 입니다.");

        System.out.println("배송료 + 신발 포함 총 금액은 " + (int) (costForDeliver + shoesPrice) + " 원 입니다");

        return costForDeliver;
    }


    public void addMoney() {
        this.totalMoney += costForDeliver;
        System.out.println("'배송 담당자'는 '자신의 매상'에 돈을 더합니다.");
        System.out.println("배송 담당자의 자신의 잔고는 " + totalMoney + " 원 입니다.");
    }


}
