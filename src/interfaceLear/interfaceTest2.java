package interfaceLear;

public class interfaceTest2 {
    public static void main(String[] args) {
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("123456");

        drone.fly();
        airplane.fly();
        
    }
}
