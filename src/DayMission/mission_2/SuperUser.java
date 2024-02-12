package DayMission.mission_2;

public class SuperUser extends ReviewerUser implements AdminRole {

    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        System.out.println(username + " 유저를 매니징 할 수 있습니다");
    }

    @Override
    public void changeSettings() {
        System.out.println(username + " 유저를 세팅을 변경할 수 있습니다");
    }
}
