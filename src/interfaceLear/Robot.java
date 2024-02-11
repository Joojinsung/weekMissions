package interfaceLear;

public class Robot implements walkble{
    private String robotID;
    private String modelName;
    private String color;
    @Override
    public void walk() {
        System.out.println("로봇이 걸어요 " + robotID + " 이 걷는중");
    }

}
