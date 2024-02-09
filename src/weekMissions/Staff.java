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
        return  nikeSneakersPrice;
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


}