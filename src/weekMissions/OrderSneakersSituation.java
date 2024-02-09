package weekMissions;

public class OrderSneakersSituation {

    public static void main(String[] args) {
        // 변수 변경 가능
        // weekMission.Customer 의 잔액, weekMission.DeliveryManager 매상, weekMission.Staff 매상은 모두 10만원 시작 입니다.



        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50000;
        boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

        boolean isCustomerLikeDelivery = true; // 고객의 배송 주문 선호 여부
        int daysForDeliver = 3; //배달 일수
        int costForDeliver = 15_000; // 배달 비용

        Customer customer = new Customer();
        DeliveryManager deliveryManager = new DeliveryManager();
        Staff staff = new Staff(nikeSneakersFeature, nikeSneakersPrice, havingNikeSneakersInStore);


        //운동화에 대해서 물어봄
        customer.askRunningShoes();
        //staff 가 운동화에 대해서 설명해줌
        staff.askNike();

        // 내가 돈이 있는지, 재고도 있는지 확인한다
        // 돈 없으면 종료
        // 돈 있으면 재고가 있는지 체크
        customer.askPay(staff, isCustomerLikeDelivery);



        /**
         *  필수 인스턴스 생성
         *  weekMission.Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 weekMission.Customer, weekMission.Staff, weekMission.DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  weekMission.Customer: 자신의 Cache 와 배송 주문선호 여부
         *  weekMission.Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */

        /**
         *  필수 인스턴스 생성
         *  weekMission.Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 weekMission.Customer, weekMission.Staff, weekMission.DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         * */

        // TODO: 클래스를 선언하고, 객체간의 협력으로 구현해주세요.
    }
}