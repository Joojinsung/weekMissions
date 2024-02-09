package weekMissions;

public class Customer {
    private long money = 75000;
    private long totalPrice;

    public void askRunningShoes() {
        //운동화에 특징에 대해서 알려줌
        System.out.println("Nike 운동화에 대해서 알려주세요!");

    }

    public void priceService(Staff staff) {
        long price = staff.getNikeSneakersPrice();
        // Staff 매출 더하기
        staff.addRevenue(price);
        //customer 잔액 업데이트
        System.out.println("customer 님의 현재 잔액은 " + money + "원");
        this.money = money - price;
        System.out.println("결제 후 잔액은 " + money + " 원 입니다");
        System.out.println("매상을 더합니다");
        //결제 완료
        System.out.println("결제 완료");
    }


    public boolean askPay(Staff staff, DeliveryManager deliveryManager, boolean Delivery) {
        boolean isOk = false;
        if (this.money >= staff.getNikeSneakersPrice()) {
            System.out.println("재고 있어요?");
            if (staff.nikeHave()) {
                System.out.println("고객은 결제를 진행합니다. 본인 잔액 - 신발가격 진행");
                priceService(staff);
                //신발을 받은 고객의 기분
                System.out.println("고객의 기분");
                feel();
            } else if (Delivery) {
                System.out.println("배송선호하기 떄문에 계속 진행 + 결제안내후 결제 진행");
                priceService(staff);
                System.out.println("배송 담당자에게 Nike 운동화를 요청합니다 ");
                System.out.println("'배송 담당자'는 택배 패키지의 배송 예정소요 일자와 배송료를 '매장직원'에게 응답 해줍니다.");
                System.out.println("직원은 고객에게 가격을 안내합니다");
                payment(staff, deliveryManager, deliveryManager.answerManager());
                isOk = true;
                return isOk;
            } else {
                System.out.println("다음에 올게요..2");
            }
        } else {
            System.out.println("다음에 올게요..1");
        }
        return isOk;
    }

    public void payment(Staff staff, DeliveryManager deliveryManager, long pay) {
        if (money >= pay) {
            System.out.println("잔액 충분");
            System.out.println("고객 잔액은 " + getMoney());
            System.out.println("고객은 주문을 계속 진행합니다");
            System.out.println("'고객'은 '배송 담당자' 에게 배송료를 지불합니다");
            deliveryManager.addMoney();
            daysForDeliver(deliveryManager.getCostForDeliver());
            System.out.println("customer 의 잔고는 " + getMoney());
            feel();


        } else {
            System.out.println("고객 잔액 부족");
            System.out.println("고객이 환불을 요청합니다");
            //staff 의 매상에서 신발 가격을 뻅니다
            System.out.println("매상에서 환불 후 staff의 잔액");
            staff.deductMoney();
            System.out.println(staff.getMoney());
            // customer 의 잔고에 신발가격만큼 잔액을 충전합니다
            setMoney(getMoney() + staff.getNikeSneakersPrice());
            System.out.println("환불 후 customer 의 잔고 " + getMoney());
            System.out.println("다음에 올게요..3");
        }
    }


    public long getMoney() {
        return money;
    }


    public void setMoney(long money) {
        this.money = money;
    }

    public void feel() {
        System.out.println("신발을 삿어요!! 기분이 좋아요!!");
    }

    public void daysForDeliver(long deliver) {
        this.money -= deliver;
    }


}
