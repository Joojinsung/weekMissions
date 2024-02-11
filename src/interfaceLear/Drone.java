package interfaceLear;

public class Drone implements Flyable{
    private String dronId;
    private long remainingFuel;
    private long ramaningFileStorage;


    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론 사진 찍는다!");
    }


}
