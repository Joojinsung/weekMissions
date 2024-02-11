package interfaceLear;

public class Airplane implements Flyable {
    private String airplaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    Airplane(String asd) {
        this.airplaneID = asd;
    }


    @Override
    public void fly() {
        System.out.println("날아요" + airplaneID);
    }

    public void refillFuel(long fuel) {
        remainingFuelAmount += fuel;
    }


}
