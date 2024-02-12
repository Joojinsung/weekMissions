package cs;

public class Car {
    //멤버변수 또는 필드
    //인스턴스의 상태를 나타내는 요소
    private String color;
    private String model;
    private String brand;

    public Car(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    // 행동
    public void drive() {
        System.out.println(brand + " " + model + " is driving");
    }

    public void accelerate() {
        System.out.println(brand + " " + model + " is accelerating");
    }

    public void stop() {
        System.out.println(brand + " " + model + " is stopping");
    }
}
