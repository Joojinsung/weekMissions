package DayMission.mission_2;

public class GeneralUser extends User implements CustomerRole{
    public GeneralUser(String username) {
        super(username);
    }

    @Override
    public void order() {
        System.out.println("유저 " + username + " 주문 할 수 있습니다");
    }

    @Override
    public void payment() {
        System.out.println("유저 " + username + " 결제 할 수 있습니다");
    }
}