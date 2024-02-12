package interfaceLear;

public class interfaceTest {
    public static void main(String[] args) {
        Flyable airplane = new Airplane("123");
        airplane.fly();
        long atmosphereLimit = Flyable.atmosphereLimit;
        System.out.println(atmosphereLimit);
    }
}
