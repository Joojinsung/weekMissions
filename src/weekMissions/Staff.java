package weekMissions;

public class Staff {

    private String nikeSneakersFeature; //안정감 | 편안함 | 가벼움 등 신발 특징
    private long nikeSneakersPrice; //가격
    private boolean havingNikeSneakersInStore; //매장 Nike sneakers 재고 여부
    private long money = 100000;


    public Staff(String nikeSneakersFeature, long nikeSneakersPrice, boolean havingNikeSneakersInStore) {
        this.nikeSneakersFeature = nikeSneakersFeature;
        this.nikeSneakersPrice = nikeSneakersPrice;
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
    }

    public void askNike() {
        System.out.println("nike 의 신발 특징은" + nikeSneakersFeature + " 가격은 " + nikeSneakersPrice + " 입니다~");
    }

    public void priceInformation() {
        System.out.println("우리 신발의 가격은 " + getNikeSneakersPrice() + " 원 입니다. 결제 진행하겠습니다!");
    }


    public long getNikeSneakersPrice() {
        return nikeSneakersPrice;
    }

    public boolean isHavingNikeSneakersInStore() {
        return havingNikeSneakersInStore;
    }


    public long getMoney() {

        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public void setNikeSneakersPrice(long nikeSneakersPrice) {
        this.nikeSneakersPrice = nikeSneakersPrice;
    }

    public boolean nikeHave() {
        boolean isOk = false;
        if (havingNikeSneakersInStore) {
            System.out.println("재고가 있어요!!");
            System.out.println("고객 : 주문을 계속 진행합니다 + 매장 직원의 신발 가격 안내");
            System.out.println("신발의 가격은 " + nikeSneakersPrice + " 원입니다");
            return true;
        } else {
            System.out.println("재고가 없어요ㅠㅠ");
            //배송 안내
            System.out.println("배송으로 해드릴까요?");
        }
        return isOk;
    }

    public void addRevenue(long revenue) {
        System.out.println("결제 하겠습니다 금액은 " + nikeSneakersPrice + " 원 입니다");
        setMoney(getMoney() + revenue);
        System.out.println("매상에 추가 후 잔고는 = " + getMoney());
        System.out.println("신발을 전달합니다 ");
    }


    public void deductMoney() {
        this.money -= getNikeSneakersPrice();

    }

}