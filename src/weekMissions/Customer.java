package weekMissions;

public class Customer {
    private long money = 50001;


    public void askRunningShoes() {
        System.out.println("Nike 운동화에 대해서 알려주세요!");
        //운동화에 특징에 대해서 알려줌

    }

    public void priceService(Staff staff) {
        staff.priceInformation();
        //staff 돈 업데이트
        staff.setMoney(staff.getMoney() + staff.getNikeSneakersPrice());
        //고객 돈 업데이트
        setMoney(getMoney() - staff.getNikeSneakersPrice());

        System.out.println("staff : 돈 " + staff.getMoney() + " 남았습니다 ");
        System.out.println("weekMission.Customer : 돈 " + getMoney()  + " 남았습니다");
        System.out.println("결제했습니다! 고객에게 전달합니다");
    }

    public void askPay(Staff staff, boolean Delivery) {

        if (this.money >= staff.getNikeSneakersPrice()) {
            if (staff.isHavingNikeSneakersInStore()) {
                System.out.println("재고 있어요?");
                System.out.println("네 재고 있어요~ ");

                //신발 가격 알려줌
                priceService(staff);
                //기분 출력 결제 끝 종료
                feel();

            } else {
                System.out.println("재고가 없습니다.. 배송으로 해드릴까요?");
                customerLikeDelivery(staff, Delivery);
                System.out.println("배송담당자 Nike에게 요청합니다");
            }
        } else {
            System.out.println("다음에 올게요..");
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

    public void customerLikeDelivery(Staff staff, boolean delivery) {
        if (delivery) {
            System.out.println("네 배송으로 할게요");
            priceService(staff);
        } else {
            System.out.println("괜찮아요 다음에 올게요");
        }
    }
}
